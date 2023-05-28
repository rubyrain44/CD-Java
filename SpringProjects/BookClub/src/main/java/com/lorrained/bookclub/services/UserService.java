package com.lorrained.bookclub.services;

import java.util.Optional;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import com.lorrained.bookclub.models.LoginUser;
import com.lorrained.bookclub.models.User;
import com.lorrained.bookclub.repositories.UserRepository;


@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
    
    /////REGISTER USER METHOD/////
    //(checks if the passwords match, if they don't, returns a null result. If they match, hashes PW and saves user//
    public User register(User u, BindingResult result) {
    	if (!u.getConfirm().equals(u.getPassword())) {
    		result.rejectValue("confirm", null, "Passwords don't match.");
    	}
    	if (result.hasErrors()) {
    		return null;
    	}
    	String hashPW = BCrypt.hashpw(u.getPassword(), BCrypt.gensalt());
    	u.setPassword(hashPW);
        return userRepo.save(u);
    }
 
    /////LOGIN USER METHOD/////
    //(checks if email exists in DB, if not, returns a null result. If so, compares PWs to match, if so, sends the user)//
    public User login(LoginUser l, BindingResult result) {
    	Optional<User> optUser = userRepo.findByEmail(l.getEmail());
    	if (optUser.isEmpty()) {
    		return null;    		
    	}
    	User user = optUser.get();
    	if (!BCrypt.checkpw(l.getPassword(), user.getPassword())) {
    		return null;
    	}
    	return user;
    }
    
    /////FIND USER/////
    //(checks the DB for the user by the ID to send back, and set to session to keep their info when logged in)//
    public User findById(Long id) {
    	Optional<User> optUser = userRepo.findById(id);
    	if (optUser.isEmpty()) {
    		return null;
    	}
    	return optUser.get();
    }
}