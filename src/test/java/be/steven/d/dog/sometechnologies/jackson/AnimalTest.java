package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void shouldIncludeRawJson_and_shouldIncludeWrapperName() throws JSONException, JsonProcessingException {
        String diet = new JSONObject()
                .put("drink","water")
                .put("food", "hay")
                .toString();
        Animal mao = new Animal("Mao","Cow");
        mao.setDiet(diet);

        String result = new ObjectMapper().writeValueAsString(mao);

        assertEquals("{\"Beast\":{\"name\":\"Mao\",\"breed\":\"Cow\",\"diet\":{\"drink\":\"water\",\"food\":\"hay\"}}}", result);
    }
}