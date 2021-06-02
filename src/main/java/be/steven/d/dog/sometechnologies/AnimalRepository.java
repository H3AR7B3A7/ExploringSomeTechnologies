package be.steven.d.dog.sometechnologies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, BigInteger> {

    Animal findByName(String animalName);
}