package dumbways.ways.todo.entity;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

@Entity
public class Category {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category", nullable = false)
    private String category;

    @JsonBackReference
    @ManyToMany(mappedBy = "category")
    private Set<Todo> todo = new HashSet<>();

    public Category() {
    }

    public Category(String category) {
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<Todo> getTodo() {
        return todo;
    }

    public void setTodo(Set<Todo> todo) {
        this.todo = todo;
    }

}
