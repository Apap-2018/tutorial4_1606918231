package com.apap.tutorial4.repository;

import com.apap.tutorial4.model.FlightModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * 
 * FlightDB
 *
 */
@Repository
public interface FlightDb extends JpaRepository<FlightModel, Long>{
	
}
