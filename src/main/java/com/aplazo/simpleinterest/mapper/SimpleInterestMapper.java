package com.aplazo.simpleinterest.mapper;

import com.aplazo.simpleinterest.dto.SimpleInterestDTO;
import com.aplazo.simpleinterest.entity.SimpleInterestEntity;

public class SimpleInterestMapper {

    public static SimpleInterestEntity dtoToEntity(SimpleInterestDTO simpleInterestDTO) {
        SimpleInterestEntity simpleInterestEntity = new SimpleInterestEntity();
        simpleInterestEntity.setAmount( simpleInterestDTO.getAmount());
        simpleInterestEntity.setRate( simpleInterestDTO.getRate());
        simpleInterestEntity.setTerms( simpleInterestDTO.getTerms());
        return simpleInterestEntity;
    }
}
