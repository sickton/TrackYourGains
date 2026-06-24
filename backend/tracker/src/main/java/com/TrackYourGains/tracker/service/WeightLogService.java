package com.TrackYourGains.tracker.service;

import com.TrackYourGains.tracker.dto.WeightLogDto;
import com.TrackYourGains.tracker.entity.WeightLog;

public interface WeightLogService {

    WeightLogDto logWeight(Long userId, WeightLogDto request);
}
