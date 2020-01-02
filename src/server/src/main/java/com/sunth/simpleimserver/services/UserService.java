package com.sunth.simpleimserver.services;

import com.sunth.simpleimserver.models.User;
import com.sunth.simpleimserver.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user){
       userRepository.save(user);
       return user;
    }
}
