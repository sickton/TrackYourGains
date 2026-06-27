package com.TrackYourGains.tracker.service.impl;

import com.TrackYourGains.tracker.dto.WeightLogDto;
import com.TrackYourGains.tracker.entity.WeightLog;
import com.TrackYourGains.tracker.mapper.WeightLogMapper;
import com.TrackYourGains.tracker.repository.UserRepository;
import com.TrackYourGains.tracker.repository.WeightLogRepository;
import com.TrackYourGains.tracker.service.WeightLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class WeightLogServiceImpl implements WeightLogService {

    @Autowired
    private WeightLogRepository weightLogRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public WeightLogDto logWeight(Long userId, WeightLogDto request) {
        if(userRepository.findById(userId).isEmpty())
            return null;
        WeightLog weightLog = WeightLogMapper.mapToWeightLog(request, userRepository.findById(userId).get());
        weightLog.setDate(LocalDate.now());
        return WeightLogMapper.mapToWeightLogDto(weightLogRepository.save(weightLog));
    }
}
