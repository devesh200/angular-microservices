package com.bookmybus.bustrip.dto;

import java.util.Date;

public class SearchBustrip {
	private Location fromloc;
	private Location toloc;
	private Date dateofjourney;
	private Date dateofreturnjourney;
	public Location getFromloc() {
		return fromloc;
	}
	public void setFromloc(Location fromloc) {
		this.fromloc = fromloc;
	}
	public Location getToloc() {
		return toloc;
	}
	public void setToloc(Location toloc) {
		this.toloc = toloc;
	}
	public Date getDateofjourney() {
		return dateofjourney;
	}
	public void setDateofjourney(Date dateofjourney) {
		this.dateofjourney = dateofjourney;
	}
	public Date getDateofreturnjourney() {
		return dateofreturnjourney;
	}
	public void setDateofreturnjourney(Date dateofreturnjourney) {
		this.dateofreturnjourney = dateofreturnjourney;
	}
	
}
