package be.steven.d.dog.sometechnologies.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Properties;

public class MyConsumer {
    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("enable.auto.commit", false); // For manual offset management
        properties.put("group.id", "test1");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);

        ArrayList<String> topics = new ArrayList<>();
        topics.add("MyTopic");

        consumer.subscribe(topics);

        try (consumer) {
            while (true) {
                ConsumerRecords<String, String> records = consumer.poll(Duration.of(1, ChronoUnit.SECONDS));

                for (ConsumerRecord<String, String> record : records) {
                    if (record.key() != null && record.key().equals("myKey")){
                        System.out.println("Record read in KafkaConsumerApp : " + record.value());
                    } else {
                        System.out.println("Record read in KafkaConsumerApp : " + record);
                    }
                }
                // Manual offset management - Useful when we want to do some checks first and ensure offset gets updated
                consumer.commitAsync();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
