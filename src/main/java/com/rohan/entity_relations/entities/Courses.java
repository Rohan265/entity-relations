package com.rohan.entity_relations.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String course_name;
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}