package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZooKeeperTest {

    @Test
    void shouldIncludeCustomEnumName() throws JsonProcessingException {
        String result = new ObjectMapper().writeValueAsString(ZooKeeper.Role.MANAGER);

        assertEquals("\"MANAGER_ROLE\"", result);
    }

    @Test
    void shouldBeFullName() throws JsonProcessingException {
        ZooKeeper keeper = new ZooKeeper(1, "Steven", "DHondt", ZooKeeper.Role.TECHNICAL);

        String result = new ObjectMapper().writeValueAsString(keeper);

        assertEquals("{\"fullName\":\"Steven DHondt\"}", result);
    }
}