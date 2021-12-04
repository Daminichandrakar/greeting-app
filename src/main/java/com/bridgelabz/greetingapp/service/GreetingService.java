package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.Greeting;
import com.bridgelabz.greetingapp.entity.GreetingAppEntity;
import com.bridgelabz.greetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepo greetingRepo;

    public String  getGreeting() {
        return "Hello World";
    }

    public GreetingAppEntity addGreeting(Greeting greeting) {
        GreetingAppEntity greetingAppEntity = new GreetingAppEntity();
        greetingAppEntity.setContent(greeting.getContent());
        return greetingRepo.save(greetingAppEntity);
    }

    public GreetingAppEntity getGreetingById(int id) {
        GreetingAppEntity greetingAppEntity = greetingRepo.findById(id).get();
            return greetingAppEntity;
    }

}
