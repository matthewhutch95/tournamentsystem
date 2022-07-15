package com.teampool.tournament.system.service;
import com.teampool.tournament.system.model.User;

import java.util.List;

/**
 * Instance of UserService to be called by controller
 */
public interface UserService {
    public User savePlayer(User user);

    public List<User> getAllUsers();

    public void deletePlayers();




}
