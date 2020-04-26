package com.capg.logincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.UserBean;
import com.capg.login.service.UserServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserLoginController {
@Autowired
public UserServiceImpl service;
	
	@PostMapping("/login")
	public String newUser(UserBean bean) {
		UserBean been=service.addNewUser(bean);
		return "Hello"+been.getUserName()+"Sucessfully Registered"+"\n"+"Your Login Id: "+been.getUserId();
	}
	
}
