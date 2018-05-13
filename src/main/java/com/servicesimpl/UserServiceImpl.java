package com.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entities.Users;
import com.services.UserServices;

@Service
public class UserServiceImpl implements UserServices{

	UserDao userDao;

	@Override
	public List<Users> userList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean DeleteUsers(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveOrupdate(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createUser(Users user) {
		// TODO Auto-generated method stub
		
	}
	

}
