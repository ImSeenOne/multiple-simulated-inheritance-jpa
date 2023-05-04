package com.example.demo.models.dao;

import com.example.demo.models.entities.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryDao extends JpaRepository<Salary, Long> {
}
