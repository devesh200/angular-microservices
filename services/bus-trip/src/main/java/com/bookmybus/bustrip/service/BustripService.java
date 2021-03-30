package com.bookmybus.bustrip.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmybus.bustrip.domain.Bustrip;
import com.bookmybus.bustrip.domain.Seat;
import com.bookmybus.bustrip.dto.SearchBustrip;
import com.bookmybus.bustrip.dto.SeatDTO;
import com.bookmybus.bustrip.repository.BustripRepository;

@Service
public class BustripService {
	@Autowired
	private BustripRepository bustripRepository;
	public List<Bustrip> searchBustrip(SearchBustrip searchBustrip){
		Optional<List<Bustrip>> bustrip=bustripRepository.searchBustrip(searchBustrip.getFromloc().getLocationName(), searchBustrip.getToloc().getLocationName(), searchBustrip.getDateofjourney());
		if(bustrip.isPresent()) {
			return bustrip.get();
		}else {
			return new ArrayList<Bustrip>();
		}
	}
	public boolean bookSeat(String tripId, List<SeatDTO> selectedSeats, String bookingId) {
		Optional<Bustrip> bustripOpt = bustripRepository.findById(tripId);
		Bustrip bustrip = null;
		if(bustripOpt.isPresent()) {
			bustrip = bustripOpt.get();
			Seat[][] seats = bustrip.getBus().getSeat();
			for(Seat[] seat: seats) {
				for(Seat s: seat) {
					for(SeatDTO selectedSeat: selectedSeats) {
						if(selectedSeat.getSeatNo().equalsIgnoreCase(s.getSeatNo())) {
							s.setBookingId(bookingId);
						}
					}
				}
			}
			bustripRepository.save(bustrip);
			return true;
		}
		
		return false;
	}
}
