package com.example.demo.models.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public final class SalaryRequest extends OutcomeRequest {
    private String employee;

    @JsonCreator
    public SalaryRequest(@JsonProperty("employee") String employee,
                         @JsonProperty("remarks") String remarks,
                         @JsonProperty("amount") Double amount) {
        super(remarks, amount);
        this.employee = employee;
    }
}
