package com.capg.fms.service;

import java.util.List;

import com.capg.fms.entity.AirportBean;

public interface IAirportService {
	//public AirportBean addAirport(AirportBean bean);
	//public AirportBean viewAirport(Integer airportCode);
	public AirportBean viewAirport(String airportName);
	}
