package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HabitatTest {

    @Test
    void unmarshallingShouldReadCustomNameForAttributes() throws JsonProcessingException {
        String json = "{\"name\":\"field\",\"atts\":[\"tree\",\"river\",\"pen\",\"feeder\"]}";

        Habitat habitat = new ObjectMapper().readerFor(Habitat.class).readValue(json);

        assertEquals(4, habitat.getAttributes().size());
    }
}