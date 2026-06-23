package com.TrackYourGains.tracker.testRun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testing")
public class TestController {

    @GetMapping("/plain-message")
    public String successTest()
    {
        return "Test was successful";
    }
}