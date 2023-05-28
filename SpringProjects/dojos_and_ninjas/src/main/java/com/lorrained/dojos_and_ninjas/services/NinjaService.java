package com.lorrained.dojos_and_ninjas.services;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorrained.dojos_and_ninjas.models.Ninja;
import com.lorrained.dojos_and_ninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	private NinjaRepository ninjaRepo;
	
	//find all
	private List<Ninja> findAll() {
		return ninjaRepo.findAll();
	}   
	
    // creates 
    public Ninja createNinja(Ninja n) {
        return ninjaRepo.save(n);
    }
    
    // retrieves one
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
}