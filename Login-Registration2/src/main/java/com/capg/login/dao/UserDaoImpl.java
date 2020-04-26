package com.capg.login.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.entity.UserBean;
@Repository
@Transactional
public class UserDaoImpl implements IUserDao{
	@PersistenceContext
	EntityManager entitymanager;
	@Override
	public UserBean addNewUser(UserBean bean) {
		// TODO Auto-generated method stub
		entitymanager.persist(bean);
		return bean;
	}

}
