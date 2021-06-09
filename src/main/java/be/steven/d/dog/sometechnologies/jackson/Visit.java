package be.steven.d.dog.sometechnologies.jackson;

public class Visit {
    private static Integer idCount = 0;
    private final Integer id;
    private final String date;

    public Visit(String date) {
        this.id = ++idCount;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public String getDate() {
        return date;
    }
}