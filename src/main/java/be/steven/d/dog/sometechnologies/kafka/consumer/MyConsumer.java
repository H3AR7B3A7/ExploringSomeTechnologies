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
        properties.put("group.id", "test1");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);

        ArrayList<String> topics = new ArrayList<>();
        topics.add("MyTopic");

        consumer.subscribe(topics);

        try (consumer) {
            while (true) {
                ConsumerRecords<String, String> records = consumer.poll(Duration.of(1, ChronoUnit.SECONDS));

                for (ConsumerRecord<String, String> record : records) {

                    System.out.println("Record read in KafkaConsumerApp : " + record.value());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
