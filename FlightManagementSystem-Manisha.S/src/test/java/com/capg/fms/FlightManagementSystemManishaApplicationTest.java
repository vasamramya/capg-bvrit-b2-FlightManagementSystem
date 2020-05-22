package com.capg.fms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.fms.dao.IUserDao;
import com.capg.fms.entity.UserBean;
import com.capg.fms.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightManagementSystemManishaApplicationTest {
	@Autowired
	private UserServiceImpl usi;
	@MockBean
	private IUserDao userDao;
	private EntityManager em;

	/*
	 * @Test public void viewUser() { List<UserBean> bean = usi.viewUser();
	 * assertEquals(bean.size(),10); }
	 */
	@Test
	public void addUser() {
		UserBean user = new UserBean();
		user.setUserId(110);
		user.setUserType("customer");
		user.setUserName("manisha");
		user.setUserPassword("mani1998");
		user.setUserPhone("9949568025");
		user.setUserEmail("mani@gmail.com");
		Mockito.when(userDao.addUser(user)).thenReturn(user);
		assertThat(usi.addUser(user)).isEqualTo(user);

	}

	@Test
	public void viewUser() {
		UserBean user1 = new UserBean();
		user1.setUserId(110);
		user1.setUserType("customer");
		user1.setUserName("manisha");
		user1.setUserPassword("mani1998");
		user1.setUserPhone("9949568025");
		user1.setUserEmail("mani@gmail.com");

		UserBean user2 = new UserBean();
		user2.setUserId(110);
		user2.setUserType("customer");
		user2.setUserName("manisha");
		user2.setUserPassword("mani1998");
		user2.setUserPhone("9949568025");
		user2.setUserEmail("mani@gmail.com");
		List<UserBean> userlist = new ArrayList<>();
		userlist.add(user1);
		userlist.add(user2);
		Mockito.when(userDao.viewUser()).thenReturn(userlist);
		assertThat(usi.viewUser()).isEqualTo(userlist);
	}

}
