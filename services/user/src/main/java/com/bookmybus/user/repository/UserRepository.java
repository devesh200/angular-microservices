package com.bookmybus.user.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmybus.user.domain.User;

public interface UserRepository extends MongoRepository<User, String>{
	User getUserByLoginId(String loginId);
}
