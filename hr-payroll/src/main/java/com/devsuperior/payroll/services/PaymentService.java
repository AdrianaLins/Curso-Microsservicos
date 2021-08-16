package com.devsuperior.payroll.services;

import org.springframework.stereotype.Service;

import com.devsuperior.payroll.entities.Payment;

//Service porque não tem banco de dados

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
		
	}

}
