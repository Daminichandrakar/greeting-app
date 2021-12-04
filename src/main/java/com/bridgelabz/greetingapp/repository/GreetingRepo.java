package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.entity.GreetingAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GreetingRepo extends JpaRepository<GreetingAppEntity, Integer> {
}
