package com.bookmybus.booking.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmybus.booking.domain.Booking;
import com.bookmybus.booking.dto.BookingDTO;
import com.bookmybus.booking.dto.ConfirmBookingDTO;
import com.bookmybus.booking.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private ModelMapper modelMapper;
	public BookingDTO save(BookingDTO bookingDTO) {
		Booking booking = modelMapper.map(bookingDTO, Booking.class);
		booking = bookingRepository.save(booking);
		bookingDTO.setId(booking.getId());
		return bookingDTO;
	}
	
	public boolean confirmBooking(ConfirmBookingDTO confirmBookingDTO) {
		Optional<Booking> bookingOpt = bookingRepository.findById(confirmBookingDTO.getBookingId());
		if(bookingOpt.isPresent()) {
			Booking booking = bookingOpt.get();
			booking.setStatus("Confirmed");
			booking.setPaymentId(confirmBookingDTO.getPaymentId());
			bookingRepository.save(booking);
			return true;
		}
		return false;
	}

	public List<BookingDTO> getBookings(String userId) {
		List<Booking> bookinglist= bookingRepository.findByUserId(userId);
		return bookinglist.stream()
				.map(book -> modelMapper.map(book, BookingDTO.class))
				.collect(Collectors.toList());
	}
}
