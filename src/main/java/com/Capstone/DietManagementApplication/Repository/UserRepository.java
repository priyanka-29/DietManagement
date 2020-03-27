package com.Capstone.DietManagementApplication.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.Capstone.DietManagementApplication.Model.User;

public interface UserRepository extends CrudRepository<User, String> {

	Optional<User> findByUsername(String username);

}
