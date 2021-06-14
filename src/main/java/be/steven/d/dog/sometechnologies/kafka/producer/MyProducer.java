package be.steven.d.dog.sometechnologies.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class MyProducer {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        try (KafkaProducer<String, String> myProducer = new KafkaProducer<>(properties)) {
            for (int i = 1; i < 250; i++) {
                Thread.sleep(1000);
                myProducer.send(new ProducerRecord<>("MyTopic", "Message Value : " + i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}