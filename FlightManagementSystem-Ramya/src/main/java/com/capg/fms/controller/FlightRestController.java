package com.capg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fms.entity.FlightBean;
import com.capg.fms.service.FlightServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class FlightRestController {
	// http://localhost:8080/flight/add
	// POSTMAN (Post : body{ "flightModel" : "SpiceJet", "carrierName" : "Ramya",
	// "seatCapacity" : 42 })
	// Don't insert number, number is :@GeneratedValue(strategy =
	// GenerationType.SEQUENCE)

	@Autowired
	FlightServiceImpl flightservice;

	@PostMapping("/flight/add") // postman: POST
	public String createFlight(@RequestBody FlightBean bean) throws Exception {
		FlightBean b = flightservice.addFlight(bean);

		return "Hello " + b.getCarrierName() + "\n Your Flight " + b.getFlightModel()
				+ " is successfully created with the number " + b.getFlightNumber();
	}

	@DeleteMapping("/flight/deleteById/{flightNumber}") // postman : DELETE
	public String deleteFlightById(@PathVariable int flightNumber)
	{
		flightservice.deleteFlight(flightNumber);
		return "your flight is deleted successfully" ;
	}
	
	@GetMapping("/flight/showall") // postman: GET
	public List<FlightBean> showAll() {
		List<FlightBean> bean = flightservice.getAll();
		return bean;

	}

	@ExceptionHandler(Exception.class)
	public String inValid(Exception e) {
		return e.getMessage();
	}

}
