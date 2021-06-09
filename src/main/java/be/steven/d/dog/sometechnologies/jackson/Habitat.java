package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class Habitat {
    private String name;
    private List<String> attributes;

    // Needs no-arg constructor
    public Habitat() {
    }

    public Habitat(String name) {
        this.name = name;
    }

    public Habitat(String name, List<String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    @JsonSetter("atts")
    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }
}