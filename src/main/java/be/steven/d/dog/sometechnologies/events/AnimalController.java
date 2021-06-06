package be.steven.d.dog.sometechnologies.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private final AnimalRepository animalRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public AnimalController(AnimalRepository animalRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.animalRepository = animalRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @PostMapping("/birth")
    public String addAnimal(@RequestParam String name, @RequestParam String breed) {
        animalRepository.save(new Animal(name, breed));

        NewAnimalEvent birthEvent = new BirthEvent(this);
        applicationEventPublisher.publishEvent(birthEvent);

        return animalRepository.findByName(name).getName() + " has been born!";
    }

    @PostMapping("add")
    public String createAnimal(@RequestParam String name, @RequestParam String breed, @RequestParam
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        animalRepository.save(new Animal(name, breed, date));

        NewAnimalEvent arrivalEvent = new ArrivalEvent(this);
        applicationEventPublisher.publishEvent(arrivalEvent);

        return animalRepository.findByName(name).getName() + " was added to zoo successfully on: " + date + "!";
    }

    @GetMapping
    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }
}
