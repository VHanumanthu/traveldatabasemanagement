package com.example.travelmanagement.service;

import com.example.travelmanagement.entity.Booking;

public interface BookingService {
    
    Booking createBooking(Booking booking);
    
    Booking getBookingById(long id);
    
    org.hibernate.mapping.List getAllPayments();

	Booking updateBooking(Booking updatedBooking, long id);

	void deleteBooking(long id);

	org.hibernate.mapping.List getAllBookings();
	
    
}

