package com.bookmybus.booking.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmybus.booking.domain.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {

public List<Booking> findByUserId(String userId);

}
