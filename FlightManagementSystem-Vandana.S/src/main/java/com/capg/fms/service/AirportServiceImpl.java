package com.capg.fms.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fms.dao.IAirportDao;
import com.capg.fms.entity.AirportBean;
@Service
public class AirportServiceImpl implements IAirportService {
	@Autowired
	IAirportDao Dao;
	/**
	 * @author Vandana:
	 * @param airportName
	 *This method display the details from AirportBean present in 
	 *particular airportName
	 */
	
	@Override
	public AirportBean viewAirport(String airportCode) {
	return Dao.viewAirport(airportCode)	;
	}
	/**
	 * @author Vandana:
	 * This method viewAllAirport will
	 * retrieve the details(object) of AirportBean
	 */

	public List<AirportBean> viewAllAirport()
	{
		return Dao.viewAllAirport();
	}
	

	



	}
