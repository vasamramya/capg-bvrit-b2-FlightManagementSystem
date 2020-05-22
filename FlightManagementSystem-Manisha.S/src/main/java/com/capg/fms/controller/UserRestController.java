package com.capg.fms.controller;

//import java.math.BigInteger;
//import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.capg.fms.entity.UserBean;
import com.capg.fms.service.UserServiceImpl;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserRestController {

	@Autowired
	UserServiceImpl usi;

	// this method addUser(): will return the object of user
	// once a new user is added in the system succesfully
	@PostMapping("/user/add") // postman :POST
	public ResponseEntity<UserBean> addUser(@Valid @RequestBody UserBean bean) {
		UserBean b = usi.addUser(bean);
		return new ResponseEntity<UserBean>(b, HttpStatus.OK);

	}
	// this method viewUser(): will return the object of all users added in the
	// system

	@GetMapping("/user/viewall") // GET:
	public List<UserBean> viewUser() {

		List<UserBean> bean = usi.viewUser();
		return bean;

	}

	// this method deleteUser(): will delete the user with particular id
	@DeleteMapping("/user/delete/{userId}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable int userId) throws Exception {
		usi.deleteUser(userId);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;

	}

	// this method vewUserId(): will view the user of particular id in the system
	@GetMapping(value = "/user/view/{userId}")
	public UserBean viewUserId(@PathVariable int userId) throws Exception {

		UserBean b = usi.viewUser(userId);
		if (b == null) {
			throw new Exception("Invalid id");
		}

		return b;
	}

	// this method updateUser(): will return the object of updated attributes of
	// users and added in to system
	@PutMapping("/user/update/{userId}")
	public UserBean updateUser(@RequestBody UserBean user, @PathVariable int userId) {

		UserBean b = usi.updateUser(user, userId);
		return b;
	}

	@ExceptionHandler(Exception.class)
	public String inValid(Exception e) {
		return e.getMessage();
	}
	
	
	
	
	
	
	
	
	

}
