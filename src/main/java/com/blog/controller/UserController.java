package com.blog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.User;
import com.blog.payloads.ApiResponse;
import com.blog.payloads.UserDto;
import com.blog.repository.UserRepository;
import com.blog.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
@Validated
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	UserRepository userRepository;

	 @PostMapping("")
	    public ResponseEntity<?> createUser( @RequestBody UserDto userDto) {
	        List<User> userEmail = userRepository.getUserByEmail(userDto.getEmail());
	        if (!userEmail.isEmpty()) {
	            return new ResponseEntity<>("User already exists with this emailid", HttpStatus.CONFLICT);
	        }

	        UserDto createUser = userService.createUser(userDto);
	        return new ResponseEntity<>(createUser, HttpStatus.CREATED);
	    }
	
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable Integer userId){
		
		UserDto updateUser = this.userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updateUser);
		
		
	}
	
	// admin do that
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer uid){
		
		this.userService.deleteUser(uid);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User delete Successfully",true),HttpStatus.OK);
		
		
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers(){
		
	return ResponseEntity.ok(this.userService.getAllUser());
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId){
		
	return ResponseEntity.ok(this.userService.getUserById(userId));
	}
	
	
	
	
	
}
