package com.example.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.health.model.HealthData;

public interface HealthRepository extends JpaRepository<HealthData, Long> {
}
