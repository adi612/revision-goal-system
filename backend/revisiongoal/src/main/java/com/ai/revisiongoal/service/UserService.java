package com.ai.revisiongoal.service;



import org.springframework.stereotype.Service;

import com.ai.revisiongoal.entity.User;
import com.ai.revisiongoal.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
