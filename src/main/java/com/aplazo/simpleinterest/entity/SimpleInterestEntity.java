package com.aplazo.simpleinterest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="simple_interest")
public class SimpleInterestEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private Double amount;
    private Integer terms;
    private Double rate;

}
