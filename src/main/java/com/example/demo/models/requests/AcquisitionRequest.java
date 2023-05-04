package com.example.demo.models.requests;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class AcquisitionRequest extends OutcomeRequest {
    private String name;

    @JsonCreator
    public AcquisitionRequest(@JsonProperty("name") String name,
                              @JsonProperty("remarks") String remarks,
                              @JsonProperty("amount") Double amount) {
        super(remarks, amount);
        this.name = name;
    }
}
