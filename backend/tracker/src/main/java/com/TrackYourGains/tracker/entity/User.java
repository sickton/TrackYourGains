package com.TrackYourGains.tracker.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "Users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /** ID of the user */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    /** first name of the user */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /** last name of the user */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /** field to store the weight of the user */
    @Column(name = "user_weight")
    private Double weight;

    /** Storing the height of the user as an embedded field */
    @Embedded
    private Height height;
}
