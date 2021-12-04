package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.entity.GreetingAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepo extends JpaRepository<GreetingAppEntity, Integer> {
}
