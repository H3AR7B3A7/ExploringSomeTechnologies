package be.steven.d.dog.sometechnologies.feign.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ZooController {

    @GetMapping("/zoo/{name}")
    public Zoo getZoo(@PathVariable String name){
        return new Zoo(name, "MyCity", Math.abs(new Random().nextInt()));
    }
}
