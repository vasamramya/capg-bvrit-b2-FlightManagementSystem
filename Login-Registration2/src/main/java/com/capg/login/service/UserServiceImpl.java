package com.capg.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.UserBean;
import com.capg.login.dao.IUserDao;
import com.capg.login.dao.UserDaoImpl;
@Service
public class UserServiceImpl implements IUserService{
@Autowired
IUserDao   dao;
	@Override
	public UserBean addNewUser(UserBean bean) {
		// TODO Auto-generated method stub
		return dao.addNewUser(bean);
	}

}
