package com.aplazo.simpleinterest.service.impl;

import com.aplazo.simpleinterest.dto.PaymentDTO;
import com.aplazo.simpleinterest.dto.SimpleInterestDTO;
import com.aplazo.simpleinterest.entity.PaymentEntity;
import com.aplazo.simpleinterest.entity.SimpleInterestEntity;
import com.aplazo.simpleinterest.repository.PaymentRepository;
import com.aplazo.simpleinterest.repository.SimpleInterestRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class SimpleInterestServiceImplTest {

    @Mock
    private PaymentRepository paymentRepository;

    @Mock
    private SimpleInterestRepository simpleInterestRepository;

    @InjectMocks
    private SimpleInterestServiceImpl simpleInterestService;

    @Test
    void getListPayments() {

        SimpleInterestDTO simpleInterestDTO = new SimpleInterestDTO();
        simpleInterestDTO.setAmount(400.00);
        simpleInterestDTO.setRate(10.00);
        simpleInterestDTO.setTerms(4);

        when(paymentRepository.save(any())).thenReturn( new PaymentEntity());
        when(simpleInterestRepository.save(any())).thenReturn( new SimpleInterestEntity());
        List<PaymentDTO> listPayments = simpleInterestService.getListPayments(simpleInterestDTO);
        Assertions.assertNotNull(listPayments);
    }
}