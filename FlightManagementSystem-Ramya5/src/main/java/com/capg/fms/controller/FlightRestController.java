package com.capg.fms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	/* http://localhost:8080/flight/add
	* POSTMAN (Post : body{ "flightModel" : "SpiceJet", "carrierName" : "Ramya", "seatCapacity" : 42 })
	* Don't insert number, number is :@GeneratedValue(strategy =GenerationType.SEQUENCE)
	*/

	@Autowired
	FlightServiceImpl flightservice;
	
     /*
      * @Author : @Ramya
      * This createFlight(FlightBean bean) method will return the object of Flight once a 
      * new Flight is added in the system Successfully
      */
	@PostMapping("/flight/add") // postman: POST
	public ResponseEntity<Boolean> createFlight(@Valid @RequestBody FlightBean bean) {
		FlightBean b = flightservice.addFlight(bean);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
		
		//return "Hello " + b.getCarrierName() + "\n Your Flight " + b.getFlightModel()
				//+ " is successfully created with the number " + b.getFlightNumber();
	}

	/* 
	 * This deleteFlightById(int flightNumber) method will removes a particular flight
	 */
	@DeleteMapping("/flight/deleteById/{flightNumber}") // postman : DELETE
	public ResponseEntity<String> deleteFlightById(@PathVariable int flightNumber)
	{
		try {
		flightservice.deleteFlight(flightNumber);
		ResponseEntity<String> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		//return "your flight is deleted successfully" ;
		return responseEntity;
		}
		catch(Exception e) 
		{
			//System.err.println("Invalid FlightNumber");
			return new ResponseEntity("Invalid Flight Number", HttpStatus.BAD_REQUEST);
		}
	}
	
	/*
	 * This showAll() method will view the details of all flights
	 */
	@GetMapping("/flight/showall") // postman: GET
	public ResponseEntity<List<FlightBean>> showAllFlights() {
		List<FlightBean> bean = flightservice.getAllFlights();
		return new ResponseEntity<List<FlightBean>>(bean,new HttpHeaders(),HttpStatus.OK);

	}

	//@ExceptionHandler(Exception.class)
	//public String inValid(Exception e) {
		//return e.getMessage();
	//}

}
