package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    void shouldUseJsonCreatorConstructor() throws JsonProcessingException {
        String json = "{\"christianName\":\"Steven\",\"surname\":\"DHondt\"}";

        final Name name = new ObjectMapper().readerFor(Name.class).readValue(json);

        assertEquals(new Name("Steven", "DHondt"), name);
    }
}