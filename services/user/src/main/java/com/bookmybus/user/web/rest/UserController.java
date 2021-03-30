package com.bookmybus.user.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmybus.user.dto.LoginDTO;
import com.bookmybus.user.dto.UserDTO;
import com.bookmybus.user.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public UserDTO login(@RequestBody LoginDTO login) {
		return userService.authenticate(login); 
	}
}
