package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

    private static final String template = "%s%s %s";
    private final AtomicLong counter = new AtomicLong();

    public Greeting getGreeting(String firstName,String lastName,String content) {
        return new Greeting(counter.incrementAndGet(),String.format(template,firstName,lastName,content));
    }

}
