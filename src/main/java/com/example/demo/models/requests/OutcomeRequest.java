package com.example.demo.models.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OutcomeRequest {
    private String remarks;

    private Double amount;

    @JsonCreator
    public OutcomeRequest(@JsonProperty("remarks") String remarks,
                          @JsonProperty("amount") Double amount) {
        this.remarks = remarks;
        this.amount = amount;
    }
}
