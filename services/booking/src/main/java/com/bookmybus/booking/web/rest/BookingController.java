package com.bookmybus.booking.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookmybus.booking.dto.BookingDTO;
import com.bookmybus.booking.dto.ConfirmBookingDTO;
import com.bookmybus.booking.service.BookingService;

@RestController
@CrossOrigin
@RequestMapping("booking")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/save")
	public BookingDTO saveBooking(@RequestBody BookingDTO bookingDTO) {
		return bookingService.save(bookingDTO);
	}
	
	@PutMapping("/confirmBooking")
	public boolean confirmBooking(ConfirmBookingDTO confirmBookingDTO) {
		bookingService.confirmBooking(confirmBookingDTO);
		return false;	
	}
	
	@GetMapping("/getBookings")
	public List<BookingDTO> getBookings(@RequestParam String userId){
		return bookingService.getBookings(userId);
	}

}
