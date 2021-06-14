package be.steven.d.dog.sometechnologies.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class MyProducer {

    private static int NUMBER_OF_PARTITIONS = 1;

    public static void main(String[] args) {
        if (args.length == 1){
            // Configure topic to have at least as many partitions or it will hang a minute each time a partition is missing
            NUMBER_OF_PARTITIONS = Integer.parseInt(args[0]);
        }

        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        properties.put("partitioner.class", "be.steven.d.dog.sometechnologies.kafka.partitioner.MyPartitioner"); // Managing partitions using a classfile

        try (KafkaProducer<String, String> myProducer = new KafkaProducer<>(properties)) {
//            for (int i = 1; i < 60; i++) {
//                Thread.sleep(1000);
//                myProducer.send(new ProducerRecord<>("MyTopic", "Message Value : " + i));
//            }
            for (int i = 1; i < 60; i++) {
                Thread.sleep(1000);
                int j = i % NUMBER_OF_PARTITIONS; // Because Kafka doesn't know about this, order isn't guaranteed.
                myProducer.send(new ProducerRecord<>("MyTopic", j, "myKey", "Message Value : " + i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}