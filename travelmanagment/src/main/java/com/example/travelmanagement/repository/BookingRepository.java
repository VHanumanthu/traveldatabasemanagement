package com.example.travelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.travelmanagement.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    
}

