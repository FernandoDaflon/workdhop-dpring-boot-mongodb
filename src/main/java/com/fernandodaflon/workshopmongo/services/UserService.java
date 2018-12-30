package com.fernandodaflon.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandodaflon.workshopmongo.domain.User;
import com.fernandodaflon.workshopmongo.repository.UserRespository;

@Service
public class UserService {
	
	@Autowired
	private UserRespository repo;

	public List<User> findAll(){
		return repo.findAll();
		
	}
}
