package com.example.travelmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.travelmanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
    
	@Query(value="select * from User where username=?",nativeQuery=true)
   User findByUsername(String username);
	
	@Query(value="select * from User where id=?",nativeQuery=true)
	 Optional<User> findById(Long id);
	
}
