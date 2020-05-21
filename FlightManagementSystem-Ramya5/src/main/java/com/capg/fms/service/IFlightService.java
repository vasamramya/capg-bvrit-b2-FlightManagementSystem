package com.capg.fms.service;

import java.util.List;

import com.capg.fms.entity.FlightBean;

public interface IFlightService {
	
	
	public FlightBean addFlight(FlightBean bean);
	
	public int deleteFlight(int flightNumber);
	
	public List<FlightBean> getAllFlights();

}
