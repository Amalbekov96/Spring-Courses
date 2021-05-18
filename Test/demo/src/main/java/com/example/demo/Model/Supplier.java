package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "Suppplier")
public class Supplier {
    private long id;
    private String name;

    public Supplier() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
