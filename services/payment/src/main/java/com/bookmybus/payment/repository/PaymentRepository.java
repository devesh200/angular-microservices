package com.bookmybus.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmybus.payment.domain.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String>{

}
