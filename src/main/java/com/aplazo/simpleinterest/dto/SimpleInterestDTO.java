package com.aplazo.simpleinterest.dto;

import lombok.Data;

@Data
public class SimpleInterestDTO {
    private Double amount;
    private Integer terms;
    private Double rate;
}
