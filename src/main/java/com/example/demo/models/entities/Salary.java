package com.example.demo.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Table(name = "salary")
@Entity
@Data
public class Salary implements Serializable, IOutcome {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String employee;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "outcome_id", referencedColumnName = "id")
    private Outcome outcome;
}
