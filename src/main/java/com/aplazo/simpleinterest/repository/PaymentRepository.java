package com.aplazo.simpleinterest.repository;

import com.aplazo.simpleinterest.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository <PaymentEntity, Long > {

}
