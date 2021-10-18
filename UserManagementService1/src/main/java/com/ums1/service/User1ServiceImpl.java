package com.ums1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums1.entity.User1;
import com.ums1.repository.User1Repository;

@Service
public class User1ServiceImpl implements User1Service {

	@Autowired
	private User1Repository user1Repository;

	public User1ServiceImpl(User1Repository user1Repository) {
		super();
		this.user1Repository = user1Repository;
	}

	@Override
	public List<User1> getAllUser1() {
		// TODO Auto-generated method stub
		return user1Repository.findAll();
	}

	@Override
	public User1 saveUser1(User1 user1) {
		// TODO Auto-generated method stub
		return user1Repository.save(user1);
	}

	@Override
	public User1 getUserById(Integer id) {
		// TODO Auto-generated method stub
		return user1Repository.findById(id).get();
	}

	@Override
	public User1 updateuser1(User1 user1) {
		// TODO Auto-generated method stub
		return user1Repository.save(user1);
	}

	@Override
	public void deleteUser1ById(Integer id) {
		// TODO Auto-generated method stub
		user1Repository.deleteById(id);
	}

}
