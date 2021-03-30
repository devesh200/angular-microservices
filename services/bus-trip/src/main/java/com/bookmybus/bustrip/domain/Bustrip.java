package com.bookmybus.bustrip.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bustrip {
	@Id
	private String id;
	private String fromLoc;
	private String toLoc;
	private Bus bus;
	private Date startDateTime;
	private Date endDateTime;
	private Float price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFromLoc() {
		return fromLoc;
	}
	public void setFromLoc(String fromLoc) {
		this.fromLoc = fromLoc;
	}
	public String getToLoc() {
		return toLoc;
	}
	public void setToLoc(String toLoc) {
		this.toLoc = toLoc;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
}
