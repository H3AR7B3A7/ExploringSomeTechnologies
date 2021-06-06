package be.steven.d.dog.sometechnologies.feign.client;

import be.steven.d.dog.sometechnologies.feign.server.Zoo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    private final ZooClient zooClient;

    public StatusController(ZooClient zooClient) {
        this.zooClient = zooClient;
    }

    @GetMapping("/status/{name}")
    public Zoo status(@PathVariable String name) {
        return zooClient.findZoo(name);
    }
}