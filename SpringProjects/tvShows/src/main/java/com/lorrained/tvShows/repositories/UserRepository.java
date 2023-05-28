package com.lorrained.tvShows.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lorrained.tvShows.models.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	public Optional<User> findByEmail(String email);
	
}
