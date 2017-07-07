package com.lzj.service;

import com.lzj.domain.Person;

public interface UserService {
	/**
	 * 根据id查询用户
	 * 
	 * @param id
	 *            主键
	 * @return 用户实体
	 */
	public Person get(String id);

	/**
	 * 保存用户
	 * 
	 * @param user
	 *            待保存的用户
	 * @return true成功
	 */
	public boolean save(Person user);
}
