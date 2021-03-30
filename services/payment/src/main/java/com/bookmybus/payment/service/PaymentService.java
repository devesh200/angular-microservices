package com.bookmybus.payment.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmybus.payment.domain.Payment;
import com.bookmybus.payment.dto.PaymentDTO;
import com.bookmybus.payment.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	@Autowired
	private ModelMapper modelMapper;
	public PaymentDTO savePayment(PaymentDTO paymentDTO) {
		paymentDTO.setTransactionId(UUID.randomUUID().toString());
		paymentDTO.setStatus("success");
		Payment payment = modelMapper.map(paymentDTO, Payment.class);
		payment = paymentRepository.save(payment);
		paymentDTO.setId(payment.getId());
		return paymentDTO;
	}
}
