package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName, lastName;

    @Enumerated(EnumType.STRING)
    private CustomerType type;

    public enum CustomerType {
        GOLD,
        SILVER,
        IRON
    }

    @ElementCollection()
    private List<String> hobbies = new ArrayList();

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerType getType() {
        return type;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public void addHobby(String hobby) {
        this.hobbies.add(hobby);
    }
}