package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CareTest {

    @Test
    void shouldContainFlattendExpenses() throws JsonProcessingException {
        Habitat field = new Habitat("field");

        Animal mao = new Animal("Mao", "cow");
        ZooKeeper anne = new ZooKeeper(1, "Anne", "Diercx", ZooKeeper.Role.FEEDER);
        Map<Animal, ZooKeeper> caregivers = new HashMap<>();
        caregivers.put(mao, anne);

        Map<String, Float> expenses = new HashMap<>();
        expenses.put("decoration", 3000f);
        expenses.put("medical", 1250f);
        expenses.put("feed", 400f);

        Care care = new Care(field, caregivers, expenses);

        String result = new ObjectMapper().writeValueAsString(care);

        assertEquals("{\"habitat\":{\"name\":\"field\",\"atts\":null},\"feed\":400.0,\"medical\":1250.0,\"decoration\":3000.0}", result);
    }
}