package com.bookmybus.bustrip.domain;

import org.springframework.data.annotation.Id;

public class Bus {

	private String id;
	private Integer busNumber;
	private String busType;
	private Seat[][] seat;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(Integer busNumber) {
		this.busNumber = busNumber;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public Seat[][] getSeat() {
		return seat;
	}
	public void setSeat(Seat[][] seat) {
		this.seat = seat;
	}
	
	
}
