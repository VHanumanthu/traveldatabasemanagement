package com.example.travelmanagement.serviceImpl;

import org.hibernate.mapping.List;

import com.example.travelmanagement.entity.Booking;
import com.example.travelmanagement.repository.BookingRepository;
import com.example.travelmanagement.service.BookingService;

public class BookingServiceImpl implements BookingService {

	private BookingRepository bookingrepository;

	@Override
	public Booking createBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingrepository.save(booking);
	}

	@Override
	public Booking getBookingById(long id) {
		// TODO Auto-generated method stub
		return bookingrepository.findById(id).get();
	}

	@Override
	public List getAllPayments() {
		// TODO Auto-generated method stub
		return  (List) bookingrepository.findAll();
	}

	@Override
	public Booking updateBooking(Booking updatedBooking, long id) {
		
		// TODO Auto-generated method stub
		Booking booking= bookingrepository.findById(id).get();
		booking.setBookingDate(updatedBooking.getBookingDate());
		
		return bookingrepository.save(booking);
	}

	@Override
	public void deleteBooking(long id) {
		// TODO Auto-generated method stub
		bookingrepository.deleteById(id);
	}

	@Override
	public List getAllBookings() {
		// TODO Auto-generated method stub
		
		return null;
	}

	
}

	
