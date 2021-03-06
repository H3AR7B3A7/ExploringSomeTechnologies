package be.steven.d.dog.sometechnologies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SomeTechnologiesApplication {
    public static void main(String[] args) {
        SpringApplication.run(SomeTechnologiesApplication.class, args);
    }
}