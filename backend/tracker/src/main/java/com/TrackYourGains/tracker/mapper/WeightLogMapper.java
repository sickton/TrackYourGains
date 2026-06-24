package com.TrackYourGains.tracker.mapper;

import com.TrackYourGains.tracker.dto.WeightLogDto;
import com.TrackYourGains.tracker.entity.User;
import com.TrackYourGains.tracker.entity.WeightLog;

public class WeightLogMapper {

    public static WeightLogDto mapToWeightLogDto(WeightLog log) {
        WeightLogDto dto = new WeightLogDto();
        dto.setId(log.getId());
        dto.setUserId(log.getUser().getId());
        dto.setMessage(log.getMessage());
        dto.setDate(log.getDate());
        dto.setWeight(log.getWeight());
        return dto;
    }

    public static WeightLog mapToWeightLog(WeightLogDto dto, User user) {
        WeightLog log = new WeightLog();
        log.setUser(user);
        log.setMessage(dto.getMessage());
        log.setWeight(dto.getWeight());
        return log;
    }
}