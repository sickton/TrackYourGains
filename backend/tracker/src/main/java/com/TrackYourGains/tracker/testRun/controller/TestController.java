package com.TrackYourGains.tracker.testRun.controller;

import com.TrackYourGains.tracker.testRun.repository.TestRepository;
import com.TrackYourGains.tracker.testRun.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/testing")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/plain-message")
    public String successTest()
    {
        return "Test was successful";
    }

    @PostMapping("/add")
    public String addMessage(@RequestParam String message) {
        return testService.addTestMessage(message);
    }
}