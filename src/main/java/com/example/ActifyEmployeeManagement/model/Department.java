package com.example.ActifyEmployeeManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Department {

    @Id
    private Integer id;

    private String name;

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}