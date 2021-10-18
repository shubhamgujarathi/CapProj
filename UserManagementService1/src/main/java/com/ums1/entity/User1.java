package com.ums1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserId;
	@Column
	private String Username;
	@Column
	private String UserPassword;
	@Column
	private int RoleId;
	
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User1(int userId, String username, String userPassword, int roleId) {
		super();
		UserId = userId;
		Username = username;
		UserPassword = userPassword;
		RoleId = roleId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public int getRoleId() {
		return RoleId;
	}

	public void setRoleId(int roleId) {
		RoleId = roleId;
	}

	
	
	
}
