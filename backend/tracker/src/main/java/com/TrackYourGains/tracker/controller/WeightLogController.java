package com.TrackYourGains.tracker.controller;

import com.TrackYourGains.tracker.dto.WeightLogDto;
import com.TrackYourGains.tracker.entity.WeightLog;
import com.TrackYourGains.tracker.repository.UserRepository;
import com.TrackYourGains.tracker.repository.WeightLogRepository;
import com.TrackYourGains.tracker.service.WeightLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("weight-logs")
public class WeightLogController {

    @Autowired
    private WeightLogService weightLogService;

    @Autowired
    private WeightLogRepository weightLogRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<List<WeightLog>> getAllWeightLogs(@PathVariable Long id) {
        if(userRepository.findById(id).isEmpty())
            return new ResponseEntity("User does not exist!", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(weightLogRepository.findByUserId(id));
    }

    @PostMapping("/{id}")
    public ResponseEntity<WeightLogDto> addWeightLog(@PathVariable Long id, @RequestBody double request) {
        if(userRepository.findById(id).isEmpty())
            return new ResponseEntity("User does not exist!", HttpStatus.NOT_FOUND);
        WeightLogDto weightLogDto = new WeightLogDto();
        weightLogDto.setUserId(id);
        weightLogDto.setWeight(request);
        weightLogDto.setMessage("User updated their weight!");
        WeightLogDto response = weightLogService.logWeight(id, weightLogDto);
        if(response != null)
            return ResponseEntity.ok(response);
        else
            return new ResponseEntity("User does not exist!", HttpStatus.NOT_FOUND);
    }
}
