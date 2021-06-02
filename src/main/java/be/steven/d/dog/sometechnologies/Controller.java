package be.steven.d.dog.sometechnologies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Controller {

    private final AnimalRepository animalRepository;

    @Autowired
    public Controller(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @PostMapping("animal")
    public String createAnimal(@RequestParam String name, @RequestParam String breed) {
        animalRepository.save(new Animal(name, breed));
        return animalRepository.findByName(name).getName() + " was saved successfully!";
    }

    @GetMapping("animal")
    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }
}
