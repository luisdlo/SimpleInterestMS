package com.aplazo.simpleinterest.mapper;

import com.aplazo.simpleinterest.dto.PaymentDTO;
import com.aplazo.simpleinterest.entity.PaymentEntity;

public class PaymentMapper {

    public static PaymentEntity dtoToEntity(PaymentDTO paymentDTO) {
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setPaymentNumber(paymentDTO.getPaymentNumber());
        paymentEntity.setPaymentDate(paymentDTO.getPaymentDate());
        paymentEntity.setAmount(paymentDTO.getAmount());
        return paymentEntity;
    }

}
