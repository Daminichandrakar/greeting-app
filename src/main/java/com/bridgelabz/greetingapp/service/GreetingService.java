package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting getGreeting(String name) {
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
