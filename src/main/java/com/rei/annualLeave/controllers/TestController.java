package com.rei.annualLeave.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String testRestController(){
        return "Test OK";
    }
}
