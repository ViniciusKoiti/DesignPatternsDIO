package com.dio.project.design.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Table(name = "scheduling")
public class Scheduling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private ZonedDateTime initialDateTime;
    @Column
    private ZonedDateTime finalDateTime;

    public Scheduling() {
    }
    public Scheduling(Long id) {
        this.id = id;
    }

    public ZonedDateTime getInitialDateTime() {
        return initialDateTime;
    }

    public void setInitialDateTime(ZonedDateTime initialDateTime) {
        this.initialDateTime = initialDateTime;
    }

    public ZonedDateTime getFinalDateTime() {
        return finalDateTime;
    }

    public void setFinalDateTime(ZonedDateTime finalDateTime) {
        this.finalDateTime = finalDateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
