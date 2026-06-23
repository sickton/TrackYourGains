package com.TrackYourGains.tracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Height {

    /** Height in feet */
    @Column(name = "height_feet")
    private int feet;

    /** Height in inches */
    @Column(name = "height_inches")
    private int  inches;
}
