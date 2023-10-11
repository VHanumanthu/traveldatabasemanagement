package com.example.travelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.travelmanagement.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    
}

