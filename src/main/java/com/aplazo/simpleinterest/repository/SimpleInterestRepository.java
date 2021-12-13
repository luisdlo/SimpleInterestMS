package com.aplazo.simpleinterest.repository;

import com.aplazo.simpleinterest.entity.SimpleInterestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleInterestRepository  extends JpaRepository<SimpleInterestEntity, Long > {

}
