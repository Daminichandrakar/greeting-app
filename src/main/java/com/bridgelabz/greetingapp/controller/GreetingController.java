package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.dto.Greeting;
import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Purpose : Create RestController demonstrate different Http methods
 *
 * @author : DAMINI CHANDRAKAR
 * @since : 03-12-2021
 */
@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
       return greetingService.getGreeting(name);
    }

    @PostMapping("/greeting1")
    public Greeting greetingUsingPostMapping(@RequestBody Greeting greeting){
        return greeting;
    }

}