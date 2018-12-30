package com.fernandodaflon.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fernandodaflon.workshopmongo.domain.User;

@Repository
public interface UserRespository extends MongoRepository<User, String> {

	
}
