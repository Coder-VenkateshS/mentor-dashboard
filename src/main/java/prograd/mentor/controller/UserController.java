package prograd.mentor.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prograd.mentor.model.User;
import prograd.mentor.service.UserService;

@RestController
public class UserController {

	private UserService userservice;
	
	@RequestMapping("login")
	public User loginUser(@RequestBody User user) {
		String email = user.getEmail();
		String password = user.getPassword();
		User userObj = null;
		if(email!=null && email !=null) {
			userObj = userservice.fetchUserByEmailIdAndPassword(email, password);
		}
		return userObj;
	}
	
}
