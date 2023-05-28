package com.lorrained.tvShows.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorrained.tvShows.models.Show;
import com.lorrained.tvShows.repositories.ShowRepository;

@Service
public class ShowService {
	
	@Autowired
	private ShowRepository showRepo;

	public List<Show> allShows() {
		return showRepo.findAll();
}
	

	public Show createShow(Show s) {
	return showRepo.save(s);
}
	
	public Show updateShow(Show s) {
	return showRepo.save(s);
}
	
    public Show findShow(Long id) {
        Optional<Show> optionalShow = showRepo.findById(id);
        if(optionalShow.isPresent()) {
            return optionalShow.get();
        } else {
            return null;
        }
    }
    
    public void delete (Long id) {
    	showRepo.deleteById(id);
    }
}