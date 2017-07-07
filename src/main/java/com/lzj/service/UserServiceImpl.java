package com.lzj.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzj.dao.UserDao;
import com.lzj.domain.Person;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public Person get(String id) {
		// TODO Auto-generated method stub
		System.out.println(userDao);
		return userDao.findOne(Integer.parseInt(id));
	}

	@Override
	public boolean save(Person user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		return false;
	}

}
