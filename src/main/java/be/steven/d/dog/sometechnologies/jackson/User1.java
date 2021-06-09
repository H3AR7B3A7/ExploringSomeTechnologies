package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.annotation.JacksonInject;

import java.util.UUID;

public class User1 {

    @JacksonInject
    private UUID id;
    private String firstName;
    private String lastName;

    public User1() {
    }

    public User1(String firstName, String lastName) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}