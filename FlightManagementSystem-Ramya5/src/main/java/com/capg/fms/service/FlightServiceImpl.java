package com.capg.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fms.dao.IFlightDao;
import com.capg.fms.entity.FlightBean;

@Service
public class FlightServiceImpl implements IFlightService {
	@Autowired
	IFlightDao flightdao;

	@Override
	public FlightBean addFlight(FlightBean bean) {
		// TODO Auto-generated method stub
		return flightdao.addFlight(bean);
	}

	@Override
	public int deleteFlight(int flightNumber) {
		
	return flightdao.deleteFlight(flightNumber);
		
		
	}

	@Override
	public List<FlightBean> getAllFlights() {
		// TODO Auto-generated method stub
		return flightdao.getAllFlights();
	}

}
