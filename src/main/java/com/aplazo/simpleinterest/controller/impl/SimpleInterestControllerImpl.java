package com.aplazo.simpleinterest.controller.impl;

import com.aplazo.simpleinterest.controller.SimpleInterestController;
import com.aplazo.simpleinterest.dto.PaymentDTO;
import com.aplazo.simpleinterest.dto.SimpleInterestDTO;
import com.aplazo.simpleinterest.service.SimpleInterestService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/interest")
public class SimpleInterestControllerImpl implements SimpleInterestController {

    private SimpleInterestService simpleInterestService;

    @Override
    @PostMapping (value = "/payments", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PaymentDTO> getListPayments( @RequestBody SimpleInterestDTO simpleInterestDTO) {
        return simpleInterestService.getListPayments(simpleInterestDTO);
    }
}
