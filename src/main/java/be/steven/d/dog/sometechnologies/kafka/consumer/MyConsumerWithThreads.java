package be.steven.d.dog.sometechnologies.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

public class MyConsumerWithThreads {
    private final static Logger LOGGER = LoggerFactory.getLogger(MyConsumerWithThreads.class);

    private MyConsumerWithThreads() {
    }

    public static void main(String[] args) throws InterruptedException {
        new MyConsumerWithThreads().run();
    }

    private void run() {
        String bootstrapServers = "localhost:9092";
        String topic = "MyTopic";
        String groupId = "test1";

        CountDownLatch latch = new CountDownLatch(1);

        LOGGER.info("Creating consumer thread");
        ConsumerRunnable consumerRunnable = new ConsumerRunnable(bootstrapServers, groupId, topic, latch);

        Thread thread = new Thread(consumerRunnable);
        thread.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            LOGGER.info("Called shutdown hook");
            consumerRunnable.shutdown();
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LOGGER.info("Application has exited");
        }));

        try {
            latch.await();
        } catch (InterruptedException e) {
            LOGGER.error("Application got interrupted", e);
        } finally {
            LOGGER.info("Application is closing down");
        }
    }

    private static class ConsumerRunnable implements Runnable {

        private final CountDownLatch latch;
        private final KafkaConsumer<String, String> consumer;

        private ConsumerRunnable(String bootstrapServers, String groupId, String topic, CountDownLatch latch) {

            this.latch = latch;

            Properties properties = new Properties();
            properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
            properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
            properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
            properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
            properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

            consumer = new KafkaConsumer<>(properties);

            consumer.subscribe(Collections.singleton(topic));
        }

        @Override
        public void run() {
            try (consumer) {
                while (true) {
                    ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));

                    for (ConsumerRecord<String, String> record : records) {
                        LOGGER.info("Key: " + record.key() + ", Value: " + record.value());
                        LOGGER.info("Partition: " + record.partition() + ", Offset: " + record.offset());
                    }
                }
            } catch (WakeupException e) {
                LOGGER.info("Received shutdown signal");
            } finally {
                latch.countDown();
            }
        }

        public void shutdown() {
            consumer.wakeup();
        }
    }
}