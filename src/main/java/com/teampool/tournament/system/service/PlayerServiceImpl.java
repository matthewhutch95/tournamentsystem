package com.teampool.tournament.system.service;

import com.teampool.tournament.system.model.Player;
import com.teampool.tournament.system.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{
    @Autowired
    private PlayerRepository playerRepository;

    // Adds a player to the database
    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    // Lists all players from the database
    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    // Delete all players from database
    @Override
    public void deletePlayers() {
        playerRepository.deleteAll();
    }


}
