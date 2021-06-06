package be.steven.d.dog.sometechnologies.liquibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/animal")
public class Controller {

    private final AnimalRepository animalRepository;

    @Autowired
    public Controller(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @PostMapping("/birth")
    public String addAnimal(@RequestParam String name, @RequestParam String breed) {
        animalRepository.save(new Animal(name, breed));
        return animalRepository.findByName(name).getName() + " has been born!";
    }

    @PostMapping("add")
    public String createAnimal(@RequestParam String name, @RequestParam String breed, @RequestParam
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        animalRepository.save(new Animal(name, breed, date));
        return animalRepository.findByName(name).getName() + " was added to zoo successfully on: " + date + "!";
    }

    @GetMapping
    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }
}
