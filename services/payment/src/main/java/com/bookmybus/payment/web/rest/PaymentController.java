package com.bookmybus.payment.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmybus.payment.domain.Payment;
import com.bookmybus.payment.dto.PaymentDTO;
import com.bookmybus.payment.service.PaymentService;

@RestController
@CrossOrigin
@RequestMapping("payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/makePayment")
	public PaymentDTO makePayment(@RequestBody PaymentDTO payment) {
		return paymentService.savePayment(payment);
	}
}
