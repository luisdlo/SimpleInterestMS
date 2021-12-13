package com.aplazo.simpleinterest.service.impl;

import com.aplazo.simpleinterest.dto.PaymentDTO;
import com.aplazo.simpleinterest.dto.SimpleInterestDTO;
import com.aplazo.simpleinterest.entity.PaymentEntity;
import com.aplazo.simpleinterest.entity.SimpleInterestEntity;
import com.aplazo.simpleinterest.mapper.PaymentMapper;
import com.aplazo.simpleinterest.mapper.SimpleInterestMapper;
import com.aplazo.simpleinterest.repository.PaymentRepository;
import com.aplazo.simpleinterest.repository.SimpleInterestRepository;
import com.aplazo.simpleinterest.service.SimpleInterestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.aplazo.simpleinterest.util.SimpleInterestUtil.calculateDayWeekly;
import static com.aplazo.simpleinterest.util.SimpleInterestUtil.calculateSimpleInterest;

@Service
@AllArgsConstructor
public class SimpleInterestServiceImpl implements SimpleInterestService {

    private PaymentRepository paymentRepository;

    private SimpleInterestRepository simpleInterestRepository;

    @Override
    public List<PaymentDTO> getListPayments(SimpleInterestDTO simpleInterestDTO) {

        SimpleInterestEntity simpleInterestEntity = SimpleInterestMapper.dtoToEntity(simpleInterestDTO);
        simpleInterestEntity = simpleInterestRepository.save(simpleInterestEntity);

        List<PaymentDTO> paymentsDTOS = new ArrayList<>();
        LocalDate paymentDate = LocalDate.now();
        for (int i = 1; i <= simpleInterestDTO.getTerms(); i++) {
            PaymentDTO paymentDTO = new PaymentDTO();

            Double interest = calculateSimpleInterest(simpleInterestDTO.getAmount(), simpleInterestDTO.getRate(), i);
            paymentDTO.setAmount(interest);

            paymentDate = calculateDayWeekly(paymentDate);

            paymentDTO.setPaymentDate(paymentDate);

            paymentDTO.setPaymentNumber(i);
            PaymentEntity paymentEntity = PaymentMapper.dtoToEntity(paymentDTO);
            paymentEntity.setSimpleInterestPayment( simpleInterestEntity.getId() );
            paymentRepository.save(paymentEntity);
            paymentsDTOS.add(paymentDTO);

        }

        return paymentsDTOS;
    }
}
