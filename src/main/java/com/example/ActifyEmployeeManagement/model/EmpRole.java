package com.example.ActifyEmployeeManagement.model;

import jakarta.persistence.*;

@Entity
public class EmpRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;

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

    public EmpRole(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmpRole() {
        super();
    }
}
