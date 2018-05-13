package com.dao;

import java.util.List;

import com.entities.Users;

public interface UserDao {
	
	public List<Users> userList();
	
	public boolean DeleteUsers(Users user);
	public boolean saveOrupdate(Users user);
	public void createUser(Users user);
}
