package com.example.travelmanagement.service;



import java.util.List;

import com.example.travelmanagement.entity.Payment;

public interface PaymentService {
    
    Payment createPayment(Payment payment);
    
    Payment getPaymentById(long id);
    
    List<Payment> getAllPayments();
    
    
    Payment updatePayment(Payment updatedPayment,long id);
    
    void deletePayment(long id);
    
    //BigDecimal calculateTotalAmountPaidByUser(Long userId);
    
   // List getPaymentsForBooking(Long bookingId);
    
}

