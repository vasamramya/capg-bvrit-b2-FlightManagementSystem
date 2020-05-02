package com.capg.login.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.login.Dao.IUserDao;
import com.capg.login.Entity.AdminLogin;
import com.capg.login.Entity.UserBean;


@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDao dao;

	@Override
	public UserBean addNewUser(UserBean bean) {
		return dao.addNewUser(bean);
	}

	

	@Override
	public List<UserBean>  userLogin(String userName,String password) {
		
	
		return dao.userLogin(userName, password);
		
	}
	@Override
	public String loggs(String name, String password) {
		
		return dao.loggs(name, password);
	}



	@Override
	public List<UserBean> getAll() {
		
		return dao.getAll();
	}
	
	
}
