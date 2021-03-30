package com.bookmybus.user.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.bookmybus.user.domain.User;
import com.bookmybus.user.dto.LoginDTO;
import com.bookmybus.user.dto.UserDTO;
import com.bookmybus.user.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ModelMapper mapper;
	public UserDTO authenticate(LoginDTO login) {
		User user = userRepository.getUserByLoginId(login.getLoginId());
		if(user == null || !login.getPassword().equals(user.getPassword())) {
			return null;
		}
		return mapper.map(user, UserDTO.class);
	}
}
