package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.dto.Greeting;
import com.bridgelabz.greetingapp.entity.GreetingAppEntity;
import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String greeting() {
        return "Welcome to this greeting message";
    }

    @GetMapping("/greeting2/{name}")
    public String greetingUsingPathVariable(
            @PathVariable String name
    ) {
        return  "Hello " + name + " Welcome to this greeting message";
    }

    @PutMapping("/greeting3")
    public String greetingUsingPutMethod(
            @RequestParam String name
    ) {
        return  "Hello " + name + " Welcome to this greeting message";
    }

    @GetMapping("/greeting4")
    public String  getGreeting() {
        return greetingService.getGreeting();
    }

    @GetMapping("/greeting6")
    public String getGreetingUsingQueryParameter(
            @RequestParam String firstName,
            @RequestParam String lastName
    ) {
        return greetingService.getGreeting() + " , " + firstName + " " + lastName;
    }

    @PostMapping("/greeting-message")
    public GreetingAppEntity addGreeting(
            @RequestBody Greeting greeting
    ) {
        return greetingService.addGreeting(greeting);
    }
}