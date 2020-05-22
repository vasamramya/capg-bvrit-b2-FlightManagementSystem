package com.capg.fms.service;

//import java.math.BigInteger;
import java.util.List;

import com.capg.fms.entity.UserBean;

public interface IUserService {

	public UserBean addUser(UserBean bean);

	public UserBean viewUser(int userId);

	public List<UserBean> viewUser();

	public UserBean updateUser(UserBean bean, int userId);

	public void deleteUser(int userId);

	public void validateUser(UserBean user);

}

