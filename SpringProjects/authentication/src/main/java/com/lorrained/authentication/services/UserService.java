package com.lorrained.authentication.services;

import java.util.Optional;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import com.lorrained.authentication.models.LoginUser;
import com.lorrained.authentication.models.User;
import com.lorrained.authentication.repositories.UserRepository;
    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
    
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
    
    public User findById(Long id) {
    	Optional<User> optUser = userRepo.findById(id);
    	if (optUser.isEmpty()) {
    		return null;
    	}
    	return optUser.get();
    }
}