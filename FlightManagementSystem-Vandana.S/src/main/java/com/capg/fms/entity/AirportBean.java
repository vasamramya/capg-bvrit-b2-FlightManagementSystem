package com.capg.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Airport")
public class AirportBean {
 @Id
 @Column(name="AIRPORT_CODE")
 private String airportCode;
 @Column(name="AIRPORT_LOCATION")
 private String airportLocation;
 @Column(name="AIRPORT_NAME")
 private String airportName;
 public String getAirportName() {
	return airportName;
}
public void setAirportName(String airportName) {
	this.airportName = airportName;
}
public String getAirportCode() {
	return airportCode;
}
public void setAirportCode(String airportCode) {
	this.airportCode = airportCode;
}
public String getAirportLocation() {
	return airportLocation;
}
public void setAirportLocation(String airportLocation) {
	this.airportLocation = airportLocation;
}
public AirportBean(String airportName,String airportCode,String airportLocation)
{
	this.airportName=airportName;
	this.airportCode=airportCode;
	this.airportLocation=airportLocation;
}
public AirportBean()
{
	
}
}
