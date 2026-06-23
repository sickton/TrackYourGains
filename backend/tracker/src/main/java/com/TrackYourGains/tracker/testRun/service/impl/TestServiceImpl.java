package com.TrackYourGains.tracker.testRun.service.impl;

import com.TrackYourGains.tracker.testRun.entity.TestEntity;
import com.TrackYourGains.tracker.testRun.repository.TestRepository;
import com.TrackYourGains.tracker.testRun.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepo;

    @Override
    public String addTestMessage(String message) {
        TestEntity newT = new TestEntity(message);
        testRepo.save(newT);
        return "Entity Saved successfully";
    }
}
