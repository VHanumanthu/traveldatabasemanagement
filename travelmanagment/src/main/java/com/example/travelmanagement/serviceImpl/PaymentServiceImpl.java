package com.example.travelmanagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travelmanagement.entity.Payment;
import com.example.travelmanagement.repository.PaymentRepository;
import com.example.travelmanagement.service.PaymentService;


@Service
public class PaymentServiceImpl implements  PaymentService{
     @Autowired
	private PaymentRepository paymentrepository;

	@Override
	public Payment createPayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentrepository.save(payment);
	}

	@Override
	public Payment getPaymentById(long id) {
		// TODO Auto-generated method stub
		return paymentrepository.findById(id).get();
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return paymentrepository.findAll();
	}

	@Override
	public Payment updatePayment(Payment updatedPayment,long id) {
		Payment p=paymentrepository.findById(id).get();
		p.setAmount(updatedPayment.getAmount());
		p.setBooking(updatedPayment.getBooking());
		// TODO Auto-generated method stub
		return paymentrepository.save(p);
	}

	@Override
	public void deletePayment(long id) {
		// TODO Auto-generated method stub
		paymentrepository.deleteById(id);
	}

	

}
	
	
