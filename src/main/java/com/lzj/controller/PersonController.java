package com.lzj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lzj.dao.UserDao;
import com.lzj.domain.Person;

@RestController
public class PersonController {
	@Autowired
	private UserDao userDao;
	@RequestMapping(path="/create",method={RequestMethod.GET})
	public String create(@RequestParam String name,@RequestParam String address){
		Person person=null;
		try{
			person=new Person();
			person.setName(name);
			person.setAddress(address);
			userDao.save(person);
		}catch (Exception e) {
			return "faile create";
		}
		return "success create";
	}
	@RequestMapping(path="/find",method={RequestMethod.GET})
	public Person find(@RequestParam String id){
		Person person=userDao.findOne(Integer.parseInt(id));
		return person;
	}
}
