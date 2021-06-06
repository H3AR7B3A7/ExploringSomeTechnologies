package be.steven.d.dog.sometechnologies.feign.server;

public class Zoo {
    private String name;
    private String city;
    private Integer size;

    public Zoo() {
    }

    public Zoo(String name, String city, Integer size) {
        this.name = name;
        this.city = city;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
