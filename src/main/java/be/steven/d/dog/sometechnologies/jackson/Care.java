package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class Care {

    private Habitat habitat;
    private Map<Animal, ZooKeeper> careGivers = new HashMap<>();
    private Map<String, Float> expenses = new HashMap<>();

    public Care(Habitat habitat, Map<Animal, ZooKeeper> careGivers, Map<String, Float> expenses) {
        this.habitat = habitat;
        this.careGivers = careGivers;
        this.expenses = expenses;
    }

    public Habitat getHabitat() {
        return habitat;
    }

//    public Map<Animal, ZooKeeper> getCareGivers() {
//        return careGivers;
//    }

    @JsonAnyGetter
    public Map<String, Float> getExpenses() {
        return expenses;
    }
}