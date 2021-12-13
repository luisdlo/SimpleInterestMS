package com.aplazo.simpleinterest.mapper;

import com.aplazo.simpleinterest.dto.PaymentDTO;
import com.aplazo.simpleinterest.entity.PaymentEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PaymentMapperTest {

    @Test
    void dtoToEntity() {
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setPaymentNumber(1);
        paymentDTO.setAmount(400.00);
        paymentDTO.setPaymentDate(LocalDate.now());
        PaymentEntity paymentEntity = PaymentMapper.dtoToEntity(paymentDTO);
        Assertions.assertNotNull(paymentEntity);

    }
}