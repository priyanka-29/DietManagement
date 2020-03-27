package com.Capstone.DietManagementApplication.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Capstone.DietManagementApplication.Model.User;
import com.Capstone.DietManagementApplication.Repository.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=new User();
		user.setUsername("pria");
		user.setPassword("pria");
		user.setUserType("admin");
		userRepository.save(user);
		Optional<User> findFirst=userRepository.findByUsername("pria");
		System.out.println("findFirstfindFirst"+findFirst.get());

		    if (!findFirst.isPresent()) {
		      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		    }
		    return findFirst.get();
	}

}
