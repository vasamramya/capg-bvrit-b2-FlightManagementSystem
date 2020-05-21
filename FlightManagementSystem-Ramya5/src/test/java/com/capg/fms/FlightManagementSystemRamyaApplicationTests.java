package com.capg.fms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.fms.dao.IFlightDao;
import com.capg.fms.entity.FlightBean;
import com.capg.fms.service.FlightServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class FlightManagementSystemRamyaApplicationTests {
	@Autowired
	private FlightServiceImpl flightservice;

	@MockBean
	private IFlightDao flightDao;
	private EntityManager entitymanager;

	
	/*
	 * @Test public void getAll() { List<FlightBean> bean = flightservice.getAll();
	 * assertEquals(bean.size(), 0); }
	 */

	@Test
	public void testAddFlight() {
		FlightBean flight = new FlightBean();
		flight.setFlightNumber(65);
		flight.setCarrierName("Samantha");
		flight.setFlightModel("spiceJet");
		flight.setSeatCapacity(51);
		Mockito.when(flightDao.addFlight(flight)).thenReturn(flight);
		assertThat(flightservice.addFlight(flight)).isEqualTo(flight);
	}

	@Test
	public void testDeleteFlight() {
		FlightBean flight = new FlightBean();
		flight.setFlightNumber(65);
		flight.setCarrierName("Samantha");
		flight.setFlightModel("spiceJet");
		flight.setSeatCapacity(51);
		Mockito.when(flightDao.deleteFlight(flight.getFlightNumber())).thenReturn(flight.getFlightNumber());
		assertThat(flightservice.deleteFlight(flight.getFlightNumber())).isEqualTo(flight.getFlightNumber());
		
	}

	@Test
	public void testgetAllFlights() {
		FlightBean flight1 = new FlightBean();
		flight1.setFlightNumber(65);
		flight1.setCarrierName("Samantha");
		flight1.setFlightModel("spiceJet");
		flight1.setSeatCapacity(51);

		FlightBean flight2 = new FlightBean();
		flight2.setFlightNumber(66);
		flight2.setCarrierName("kajal");
		flight2.setFlightModel("Kingfisher");
		flight2.setSeatCapacity(87);

		List<FlightBean> flightlist = new ArrayList<>();
		flightlist.add(flight1);
		flightlist.add(flight2);

		Mockito.when(flightDao.getAllFlights()).thenReturn(flightlist);
		assertThat(flightservice.getAllFlights()).isEqualTo(flightlist);

	}
	
	
	@Test
	public void getAll() {
		FlightBean flight3 = new FlightBean();
		flight3.setFlightNumber(65);
		flight3.setCarrierName("Samantha");
		flight3.setFlightModel("spiceJet");
		flight3.setSeatCapacity(51);

		FlightBean flight4 = new FlightBean();
		flight4.setFlightNumber(66);
		flight4.setCarrierName("kajal");
		flight4.setFlightModel("Kingfisher");
		flight4.setSeatCapacity(87);

		List<FlightBean> flightlist1 = new ArrayList<>();
		flightlist1.add(flight3);
		flightlist1.add(flight4);

		Mockito.when(flightDao.getAllFlights()).thenReturn(flightlist1);
		assertEquals(flightlist1.size(), 2);

	}

}
