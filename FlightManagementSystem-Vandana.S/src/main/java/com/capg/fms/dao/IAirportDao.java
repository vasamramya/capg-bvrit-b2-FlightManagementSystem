package com.capg.fms.dao;

import java.util.List;

import com.capg.fms.entity.AirportBean;

public interface IAirportDao {
	
	public List<AirportBean> viewAllAirport();
	//public AirportBean addAirport(AirportBean bean);
	public AirportBean viewAirport(String airportName);
	
	
	

}
