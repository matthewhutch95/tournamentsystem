package com.teampool.tournament.system.service;

import com.teampool.tournament.system.model.User;
import com.teampool.tournament.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    // Adds a user to the database
    @Override
    public User savePlayer(User user){
        return userRepository.save(user);
    }
    // Lists all players from the database
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    // Delete all players from database
    @Override
    public void deletePlayers() {
        userRepository.deleteAll();
    }

    }





