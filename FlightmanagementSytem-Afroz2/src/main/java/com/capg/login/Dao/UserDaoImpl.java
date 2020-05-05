package com.capg.login.Dao;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.capg.login.Entity.AdminLogin;
import com.capg.login.Entity.UserBean;


@Repository //database for creation 
@Transactional //declaring classes and subclasses
public class UserDaoImpl implements IUserDao{ 
	
//extends CrudRepository<UserBean>{
	
	//EntityManager is used to access a database in a particular application
	@PersistenceContext
	EntityManager entityManager; 
	
	
	@Override
	public UserBean addNewUser(UserBean bean) {
		entityManager.persist(bean); //
		return bean;
	}
	
	@Override
	
public List<AdminLogin> adminLogin(String name,String password) {
		//TypedQuery<AdminLogin> query=entityManager.createQuery(" from AdminLogin", AdminLogin.class);
		//System.out.println("This is"+query );
		//entityManager.persist(query);
	
		if(name.equals("Afroz")&&password.equals("Afroz624@")||name.equals("Ashutosh")&&password.equals("Ashutosh111@"))
			return adminLogin(name, password);
  return adminLogin(name, password);
	}
	
	
	@Override
	public List<UserBean> userLogin(String name,String password) {
		TypedQuery<UserBean> query=entityManager.createQuery(" from UserBean", UserBean.class);
		
					   return query.getResultList();

	
		
	}
//	/
//	 * @Query( value = "SELECT * FROM Users u WHERE u.status = ?1", nativeQuery =
//	 * true) User findUserByStatusNative(Integer status);
//	 */
//	
	/*select h from History h where h.acc_id="+id,
	 * @Query(" ",) public UserBean UserBean1(String userName,String password) {
	 * 
	 * }
	 */
	
	
	@Override
	public String loggs(String name, String password) {
		//AdminLogin been=(AdminLogin) entityManager.createNamedStoredProcedureQuery(name);
	
		if(name.equals("Afroz")&&password.equals("Afroz624@")||name.equals("Ashutosh")&&password.equals("Ashutosh111@"))
			return "Hello "+name+ "Sucessfully login";
		else
	return "Invalid name= "+name+"or password= "+password;
}

	@Override
	public List<UserBean> getAll() {
		TypedQuery<UserBean> query = entityManager.createQuery("from UserBean", UserBean.class);
		return query.getResultList();
	
	}
}
