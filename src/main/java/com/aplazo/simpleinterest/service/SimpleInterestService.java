package com.aplazo.simpleinterest.service;

import com.aplazo.simpleinterest.dto.PaymentDTO;
import com.aplazo.simpleinterest.dto.SimpleInterestDTO;

import java.util.List;

public interface SimpleInterestService {
    List<PaymentDTO> getListPayments(SimpleInterestDTO simpleInterestDTO);
}
