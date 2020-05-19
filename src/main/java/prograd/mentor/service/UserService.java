package prograd.mentor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import prograd.mentor.model.User;
import prograd.mentor.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepository;
	public User fetchUserByEmailIdAndPassword(String email, String password) {
		return userrepository.fetchUserByEmailIdAndPassword(email, password);
	}
}
