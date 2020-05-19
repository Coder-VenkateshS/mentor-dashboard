package prograd.mentor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import prograd.mentor.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User fetchUserByEmailIdAndPassword(String email, String password) ;
}
