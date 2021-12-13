package com.aplazo.simpleinterest.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="payment")
public class PaymentEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private Integer paymentNumber;
    private Double amount;
    private LocalDate paymentDate;

    private Long simpleInterestPayment;
}
