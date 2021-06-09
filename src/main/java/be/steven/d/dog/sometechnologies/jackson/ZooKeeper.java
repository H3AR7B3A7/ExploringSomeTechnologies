package be.steven.d.dog.sometechnologies.jackson;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public class ZooKeeper {
    public enum Role {
        MANAGER(1, true),
        BIOLOGIST(3, false),
        FEEDER(2, false),
        HR(3, true),
        TECHNICAL(2, false);

        private Integer accesLevel;
        private Boolean worksFromHome;

        Role(Integer accesLevel, Boolean worksFromHome) {
            this.accesLevel = accesLevel;
            this.worksFromHome = worksFromHome;
        }

        @JsonValue
        public String getRole() {
            return this.name() + "_ROLE";
        }

        public Integer getAccesLevel() {
            return accesLevel;
        }

        public Boolean getWorksFromHome() {
            return worksFromHome;
        }
    }

    private Integer id;
    private String firstName;
    private String lastName;
    private Role role;

    public ZooKeeper(Integer id, String firstName, String lastName, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Role getRole() {
        return role;
    }

    @JsonValue
    public Map<String, String> toJson() {
        Map<String, String> values = new HashMap<>();
        values.put("fullName", String.format("%s %s", getFirstName(), getLastName()));
        return values;
    }
}
