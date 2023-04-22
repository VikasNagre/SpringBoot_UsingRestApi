package com.example.startProject.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.startProject.service.PaymentService;

@Service
public class PaymentServiceImpl2 implements PaymentService {

	private static Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		logger.info("In PaymentServiceImpl2");
		
	}

}
