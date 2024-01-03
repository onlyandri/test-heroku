package com.deploy.heroku.testheroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/v1")
public class MainController {

    @GetMapping
    public String getMappingTesting() {
        return "testing to heroku app";
    }
}
