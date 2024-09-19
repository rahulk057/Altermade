package com.blog.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.blog.entity.User;
import com.blog.payloads.UserDto;

public interface  UserRepository extends JpaRepository<User, Integer> {
	
	
	Optional<User> findByEmail(String email);
	
	@Query("SELECT u FROM User u WHERE u.email = :email")
    public List<User> getUserByEmail( String email);

}
