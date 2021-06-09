package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.ArrayList;
import java.util.List;

// This will order the properties in the array in the same order, and the remaining ones alphabetically
//@JsonPropertyOrder(value = {"test", "firstName", "lastName", "id"}, alphabetic = true)
public class Visitor {

    private List<Visit> visits = new ArrayList<>();

    private final String zIndex;
    private final String aIndex;
    private final String firstName;
    private final String lastName;

    public Visitor(String zIndex, String aIndex, String firstName, String lastName) {
        this.zIndex = zIndex;
        this.aIndex = aIndex;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //    @JsonGetter
    @JsonGetter("test")
    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getzIndex() {
        return zIndex;
    }

    public String getaIndex() {
        return aIndex;
    }
}
