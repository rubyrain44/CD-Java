package com.johnp.musicfest.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johnp.musicfest.models.Lineup;

@Repository
public interface LineupRepository extends CrudRepository<Lineup, Long>{



	List<Lineup> findAll();
	public Optional<Lineup> findById(Long Id);
	void deleteById(Long id);
}

