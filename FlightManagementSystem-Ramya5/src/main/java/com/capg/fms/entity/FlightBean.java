package com.capg.fms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Flight_Spring")
public class FlightBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int flightNumber;
	

	@NotEmpty(message = "FlightModel is Mandatory field. Please provide flightModel")
	@Size(min = 4, message = "Name should have atleast:4 characters")
	private String flightModel;
	
	@NotEmpty(message = "CarrierName is Mandatory field. Please provide carrierName")
	@Size(min = 4, message = "Name should have atleast:4 characters")
	private String carrierName;
	
	//@NotEmpty(message = "seatCapacity is Mandatory field. Please provide seatCapacity")
	@NotNull(message = "SeatCapacity cannot be null")
	@Min(value=10,message = "SeatCapacity cannot be smaller than 1")
	@Max(value=99,message = "SeatCapacity cannot be greater than 99")
	private int seatCapacity;
	
	@Override
	public String toString() {
		return "FlightBean [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", carrierName="
				+ carrierName + ", seatCapacity=" + seatCapacity + "]";
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
}
