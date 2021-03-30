package com.bookmybus.bustrip.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmybus.bustrip.domain.Bustrip;
import com.bookmybus.bustrip.dto.BookingDTO;
import com.bookmybus.bustrip.dto.SearchBustrip;
import com.bookmybus.bustrip.service.BustripService;

@RestController
@RequestMapping("bustrip")
@CrossOrigin
public class BustripController {
	@Autowired
	private BustripService bustripService;
	@PostMapping("/searchBustrip")
	public List<Bustrip> searchBustrip(@RequestBody SearchBustrip searchBustrip){
		return bustripService.searchBustrip(searchBustrip);
	}
	
	@PutMapping("/bookSeat")
	public boolean bookSeat(@RequestBody BookingDTO booking) {
		boolean status = bustripService.bookSeat(booking.getTripId(), booking.getSelectedSeats(), booking.getId());
		return status;	
	}
	
}
