package com.TrackYourGains.tracker.entity;

import com.TrackYourGains.tracker.enums.Category;
import com.TrackYourGains.tracker.enums.Equipment;
import com.TrackYourGains.tracker.enums.MuscleGroup;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "muscle_group")
    @Enumerated(EnumType.STRING)
    private MuscleGroup muscleGroup;

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "equipment_used")
    @Enumerated(EnumType.STRING)
    private Equipment equipment;
}
