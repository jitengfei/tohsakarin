package com.c4.serviceImpl;

import com.c4.dao.UserDao;
import com.c4.entity.User;
import com.c4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	public User findUserByUserId(Long id){
		
		return userDao.selectByPrimaryKey(id);
	}
}
