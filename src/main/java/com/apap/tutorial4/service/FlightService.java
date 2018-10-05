package com.apap.tutorial4.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tutorial4.model.FlightModel;

/**
 * 
 * FlightService
 *
 */
@Service
public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlightById(long id);
	List<FlightModel> getListFlight();
}
