package be.steven.d.dog.sometechnologies.feign.client;

import be.steven.d.dog.sometechnologies.feign.server.Zoo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "zoo", url = "http://localhost:8080")
public interface ZooClient {

    @GetMapping(value = "/zoo/{name}")
    Zoo findZoo(@PathVariable String name);
}
