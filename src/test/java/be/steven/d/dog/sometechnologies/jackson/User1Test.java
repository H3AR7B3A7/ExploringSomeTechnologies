package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class User1Test {
    @Test
    void injectInSerialization_withClassName() throws JsonProcessingException {
        UUID uuid = UUID.fromString("de72337f-b37d-4d4a-99f4-b8614aaf9f2b");
        String json = "{\"firstName\":\"Steven\",\"lastName\":\"DHondt\"}";

        InjectableValues inject = new InjectableValues.Std().addValue(UUID.class, uuid);
        User1 user = new ObjectMapper().reader(inject).forType(User1.class).readValue(json);

        assertEquals(uuid, user.getId());
    }

    @Test
    void injectInSerialization_withGivenName() throws JsonProcessingException {
        UUID uuid = UUID.fromString("de72337f-b37d-4d4a-99f4-b8614aaf9f2b");
        String json = "{\"firstName\":\"Steven\",\"lastName\":\"DHondt\"}";

        InjectableValues inject = new InjectableValues.Std().addValue("identification", uuid);
        User2 user = new ObjectMapper().reader(inject).forType(User2.class).readValue(json);

        assertEquals(uuid, user.getId());
    }
}