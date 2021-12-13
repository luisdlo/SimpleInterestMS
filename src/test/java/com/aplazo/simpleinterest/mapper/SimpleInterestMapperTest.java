package com.aplazo.simpleinterest.mapper;

import com.aplazo.simpleinterest.dto.SimpleInterestDTO;
import com.aplazo.simpleinterest.entity.SimpleInterestEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleInterestMapperTest {

    @Test
    void dtoToEntity() {
        SimpleInterestDTO simpleInterestDTO = new SimpleInterestDTO();
        simpleInterestDTO.setAmount(20.00);
        simpleInterestDTO.setRate(10.00);
        simpleInterestDTO.setTerms(2);
        SimpleInterestEntity simpleInterestEntity = SimpleInterestMapper.dtoToEntity(simpleInterestDTO);
        Assertions.assertNotNull(simpleInterestEntity);
    }
}