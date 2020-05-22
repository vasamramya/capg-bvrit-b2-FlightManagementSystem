package com.capg.fms.service;

//import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.fms.dao.IUserDao;
import com.capg.fms.entity.UserBean;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDao dao;

	@Override
	public UserBean addUser(UserBean bean) {
		return dao.addUser(bean);
	}

	@Override
	public List<UserBean> viewUser() {
		return dao.viewUser();
	}

	@Override
	public void deleteUser(int userId) {
		dao.deleteUser(userId);
	}

	@Override
	public UserBean viewUser(int userId) {
		return dao.viewUser(userId);
	}

	@Override
	public UserBean updateUser(UserBean bean, int userId) {
		return dao.updateUser(bean, userId);
	}

	@Override
	public void validateUser(UserBean user) {

	}

}
