package be.steven.d.dog.sometechnologies;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer animalId;
    private String name;
    private String breed;

    public Animal() {
    }

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
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
}
