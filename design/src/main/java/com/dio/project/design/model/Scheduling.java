package com.dio.project.design.model;

import jakarta.persistence.*;

@Entity
@Table(name = "scheduling")
public class Scheduling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Scheduling() {
    }
    public Scheduling(Long id) {
        this.id = id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
