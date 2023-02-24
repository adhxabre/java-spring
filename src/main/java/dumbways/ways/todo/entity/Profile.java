package dumbways.ways.todo.entity;

import jakarta.persistence.*;

@Entity
public class Profile {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "number", nullable = false)
    private Integer number;

    public Profile() {
    }

    public Profile(String address, String state, Integer number, User user) {
        this.address = address;
        this.state = state;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
