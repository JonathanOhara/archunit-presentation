package edu.jonathan.archunit.domain;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;

    @Column
    private Long minutesPlusSeconds;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMinutesPlusSeconds() {
        return minutesPlusSeconds;
    }

    public void setMinutesPlusSeconds(Long minutesPlusSeconds) {
        this.minutesPlusSeconds = minutesPlusSeconds;
    }
}
