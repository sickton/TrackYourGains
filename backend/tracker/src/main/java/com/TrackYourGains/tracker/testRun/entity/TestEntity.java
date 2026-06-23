package com.TrackYourGains.tracker.testRun.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Test")
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Message")
    private String message;

    public TestEntity(String message)
    {
        this.message = message;
    }

    public TestEntity() {

    }
}
