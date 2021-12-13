package com.aplazo.simpleinterest.controller;

import com.aplazo.simpleinterest.dto.PaymentDTO;
import com.aplazo.simpleinterest.dto.SimpleInterestDTO;

import java.util.List;

public interface SimpleInterestController {

     List<PaymentDTO> getListPayments(SimpleInterestDTO simpleInterestDTO);

}
