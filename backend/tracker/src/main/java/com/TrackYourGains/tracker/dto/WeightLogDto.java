package com.TrackYourGains.tracker.dto;

import com.TrackYourGains.tracker.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class WeightLogDto {

    private Long id;
    private Long userId;
    private String message;
    private LocalDate date;
    private double weight;
}
