package com.TrackYourGains.tracker.dto;

import com.TrackYourGains.tracker.entity.Height;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    /** ID of the user */
    private Long id;

    /** first name of the user */
    private String firstName;

    /** last name of the user */
    private String lastName;

    /** field to store the weight of the user */
    private Double weight;

    /** Storing the height of the user as an embedded field */
    private Height height;
}
