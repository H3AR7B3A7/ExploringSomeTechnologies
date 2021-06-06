package be.steven.d.dog.sometechnologies.liquibase;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer animalId;
    private String name;
    private String breed;
    private LocalDate date;

    public Animal() {
    }

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.date = LocalDate.now();
    }

    public Animal(String name, String breed, LocalDate date) {
        this.name = name;
        this.breed = breed;
        this.date = date;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
