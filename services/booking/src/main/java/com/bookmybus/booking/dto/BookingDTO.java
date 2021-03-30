package com.bookmybus.booking.dto;

import java.util.Date;
import java.util.List;

public class BookingDTO {
private String id;
private String fromLoc;
private String toLoc;
private Date startDateTime;
private List<SeatDTO> selectedSeats;
private float totalAmount;
private String tripId;
private String paymentId;
private String userId;
// pending confirmed
private String status;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
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
public Date getStartDateTime() {
	return startDateTime;
}
public void setStartDateTime(Date startDateTime) {
	this.startDateTime = startDateTime;
}
public List<SeatDTO> getSelectedSeats() {
	return selectedSeats;
}
public void setSelectedSeats(List<SeatDTO> selectedSeats) {
	this.selectedSeats = selectedSeats;
}
public float getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(float totalAmount) {
	this.totalAmount = totalAmount;
}
public String getTripId() {
	return tripId;
}
public void setTripId(String tripId) {
	this.tripId = tripId;
}
public String getPaymentId() {
	return paymentId;
}
public void setPaymentId(String paymentId) {
	this.paymentId = paymentId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


}
