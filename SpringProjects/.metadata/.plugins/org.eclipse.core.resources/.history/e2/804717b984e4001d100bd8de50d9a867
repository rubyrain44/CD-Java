package com.johnp.musicfest.services;

import java.util.List;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnp.musicfest.models.Lineup;
import com.johnp.musicfest.repositories.LineupRepository;



@Service
public class LineupService {
    @Autowired
    private LineupRepository LineupRepo;

	public Lineup findById(Long id) {
		
		Optional<Lineup> result = LineupRepo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
	

	public List<Lineup> all() {
		return LineupRepo.findAll();
	}
	
	public Lineup create(Lineup lineup) {
		return LineupRepo.save(lineup);
	}
	

	public void delete (Long id) {
		LineupRepo.deleteById(id);
	
	}
	
	public Lineup update(Lineup lineup) {
		return LineupRepo.save(lineup);
	}

}
