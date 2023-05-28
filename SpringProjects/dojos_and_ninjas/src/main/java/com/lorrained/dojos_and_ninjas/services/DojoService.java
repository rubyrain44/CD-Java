package com.lorrained.dojos_and_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorrained.dojos_and_ninjas.models.Dojo;
import com.lorrained.dojos_and_ninjas.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dojoRepo;
	
	//find all
	public List<Dojo> findAllDojos() {
		return dojoRepo.findAll();
	}   
	
    // creates 
    public Dojo createDojo(Dojo d) {
        return dojoRepo.save(d);
    }
    
    // retrieves one
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
}