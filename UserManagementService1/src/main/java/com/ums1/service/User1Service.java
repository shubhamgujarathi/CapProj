package com.ums1.service;

import java.util.List;

import com.ums1.entity.User1;

public interface User1Service {
	
	List<User1> getAllUser1();
	
	User1 saveUser1(User1 user1);

	User1 getUserById(Integer id);

	User1 updateuser1(User1 user1);

	void deleteUser1ById(Integer id);

}
