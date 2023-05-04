package com.example.demo.models.dao;

import com.example.demo.models.entities.Outcome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutcomeDao extends JpaRepository<Outcome, Long> {
}
