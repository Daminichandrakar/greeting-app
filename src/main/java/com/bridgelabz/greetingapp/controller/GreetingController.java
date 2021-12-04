package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.dto.Greeting;
import com.bridgelabz.greetingapp.entity.GreetingAppEntity;
import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/get-greeting")
    public String getGreetingWithName(
            @RequestParam (value = "firstName", defaultValue = "Dear") String firstName,
            @RequestParam (value = "laststName", defaultValue = "Ma'm/Sir") String lastName) {
        return greetingService.getGreeting() + " , " + firstName + " " + lastName;
    }

    @PostMapping("/add-greeting")
    public GreetingAppEntity addGreeting(
            @RequestBody Greeting greeting
    ) {
        return greetingService.addGreeting(greeting);
    }

    @GetMapping(value="/get-greeting-by-id")
    public GreetingAppEntity getGreetingById(@RequestParam int id){
        return  greetingService.getGreetingById(id);
    }

    @GetMapping(value="/get-all-messages")
    public List<GreetingAppEntity> getAllGreetings(){
        return  greetingService.greetings();
    }
}