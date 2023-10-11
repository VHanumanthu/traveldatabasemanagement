package com.example.travelmanagement.serviceImpl;

import java.lang.module.ResolutionException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travelmanagement.Exception.ResourceNotFoundException;
import com.example.travelmanagement.entity.User;
import com.example.travelmanagement.repository.UserRepository;
import com.example.travelmanagement.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository  userrepository;

	@Override
	public User createUser(User user) {
		
		
		return userrepository.save(user);
	}

	@Override
	public User getUserByUserName(String userName) {
		User  user1 =userrepository.findByUsername(userName);
		
		return user1;
	}

	@Override
	public User updateUser(String  userName, User updatedUser) {
		
		User user2 = userrepository.findByUsername(userName);
		if(user2!=null) {
			user2.setUsername(user2.getUsername());   
			user2.setPassword(user2.getPassword());
			user2.setBookings(user2.getBookings());
		return  userrepository.save(user2);
		} 
		else 
		{
			throw new ResolutionException();
		}  
	}

	@Override
	public void deleteUser(Long id) {
		Optional<User> user2 = userrepository.findById(id);
		
		if(user2 !=null) {
			userrepository.deleteById(id);
		}
		else {
			throw new ResourceNotFoundException();
		}	
		
	}

}
