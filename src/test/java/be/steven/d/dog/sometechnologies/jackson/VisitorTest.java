package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VisitorTest {

//    @Test
    void jsonGetter() throws JsonProcessingException, JSONException {
        Visitor visitor = new Visitor("z1", "a1", "Steven", "DHondt");
        visitor.setVisits(List.of(new Visit("Yesterday")));

        String result = new ObjectMapper().writeValueAsString(visitor);

        // We should not rely on order in JSON objects, but we could do so using a linked hashmap (obj):
        // JSONObject json = JSONObject.toJSONString(obj)

//        String expected = new JSONObject()
//                .put("visits", new JSONObject()
//                    .put("id",1)
//                    .put("date", "Yesterday"))
//                .put("firstName","Steven")
//                .put("lastName", "Dhondt")
//                .put("zIndex", "z1")
//                .put("aIndex", "a1")
//                .toString();

        assertEquals("{\"visits\":[{\"id\":1,\"date\":\"Yesterday\"}],\"firstName\":\"Steven\",\"lastName\":\"DHondt\",\"zIndex\":\"a1\",\"aIndex\":\"z1\"}", result);
    }

    @Test
    void jsonGetter_withOtherName() throws JsonProcessingException, JSONException {
        Visitor visitor = new Visitor("a1", "z1", "Steven", "DHondt");
        visitor.setVisits(List.of(new Visit("Yesterday")));

        String result = new ObjectMapper().writeValueAsString(visitor);

        // We should not rely on order in JSON objects, but we could do so using a linked hashmap (obj):
        // JSONObject json = JSONObject.toJSONString(obj)

//        String expected = new JSONObject()
//                .put("test", new JSONObject()
//                        .put("id",1)
//                        .put("date", "Yesterday"))
//                .put("firstName","Steven")
//                .put("lastName", "Dhondt")
//                .put("zIndex", "z1")
//                .put("aIndex", "a1")
//                .toString();

        assertEquals("{\"zIndex\":\"a1\",\"aIndex\":\"z1\",\"firstName\":\"Steven\",\"lastName\":\"DHondt\",\"test\":[{\"id\":1,\"date\":\"Yesterday\"}]}", result);
    }

}