package com.example.demo.models.dao;

import com.example.demo.models.entities.Acquisition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcquisitionDao extends JpaRepository<Acquisition, Long> {
}
