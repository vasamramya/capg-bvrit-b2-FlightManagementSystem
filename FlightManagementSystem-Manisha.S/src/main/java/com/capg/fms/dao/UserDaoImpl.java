package com.capg.fms.dao;

//import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.fms.entity.UserBean;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public UserBean addUser(UserBean bean) {
		em.persist(bean);

		return bean;

	}

	@Override
	public List<UserBean> viewUser() {
		TypedQuery<UserBean> query = em.createQuery("from UserBean", UserBean.class);
		return query.getResultList();
	}

	@Override
	public UserBean viewUser(int userId) {
		return em.find(UserBean.class, userId);

	}

	@Transactional
	public UserBean updateUser(UserBean bean, int userId) {
		// UserBean bean1=em.find(UserBean.class,userId);
		/*
		 * // bean.setUserName(user.getUserName()); //
		 * bean.setUserType(user.getUserType()); //
		 * bean.setUserPassword(user.getUserPassword()); //
		 * bean.setUserPhone(user.getUserPhone()); //
		 * bean.setUserEmail(user.getUserEmail()); // em.persist(bean);
		 */
		
em.merge(bean);
		return bean;

	}

	@Override
	public void deleteUser(int userId) {
		UserBean b = em.find(UserBean.class, userId);
		em.remove(b);
	}

	@Override
	public void validateUser(UserBean user) {

	}

}
