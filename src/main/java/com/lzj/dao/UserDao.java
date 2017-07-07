package com.lzj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lzj.domain.Person;
//Spring会为UserDao生成一个代理对象
public interface UserDao extends JpaRepository<Person, Integer>{
	Person findByName(String name);
}
