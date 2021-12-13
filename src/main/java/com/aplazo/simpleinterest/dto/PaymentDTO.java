package com.aplazo.simpleinterest.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PaymentDTO {
    private Integer paymentNumber;
    private Double amount;
    private LocalDate paymentDate;

}
