package com.example.demo.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="outcomes")
@Entity
@Data
@NoArgsConstructor
public class Outcome {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String type;

    private String remarks;

    private Double amount;

    public Outcome(String type, String remarks, Double amount) {
        this.type = type;
        this.remarks = remarks;
        this.amount = amount;
    }
}
