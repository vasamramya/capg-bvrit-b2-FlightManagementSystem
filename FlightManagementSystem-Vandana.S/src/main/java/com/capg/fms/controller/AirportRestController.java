package com.capg.fms.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fms.entity.AirportBean;
import com.capg.fms.service.AirportServiceImpl;
@CrossOrigin(origins="http://localhost:4200")
@RestController

public class AirportRestController {
	@Autowired
	 AirportServiceImpl service;

	/**
	 * @author Vandana : 
	 * This method viewAllAirport will retrieve the details
	 * which we created before in AirportBean
	 */
	@GetMapping("/airport/findall")
	public List<AirportBean> viewAllAirport(){
		List<AirportBean> bean=service.viewAllAirport();
		return bean;
	}
	/**
	 * @author Vandana:
	 * @param airportName
	 *This method retreives the details from AirportBean present in 
	 *particular airportName
	 */
	@GetMapping("/airport/{airportCode}")
	public AirportBean viewAirport(@PathVariable String airportCode)
	{
		return service.viewAirport(airportCode);
	}
		
	

	
	
}
