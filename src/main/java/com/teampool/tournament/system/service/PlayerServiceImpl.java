package com.teampool.tournament.system.service;

import com.teampool.tournament.system.model.Player;
import com.teampool.tournament.system.model.Tournament;
import com.teampool.tournament.system.repository.PlayerRepository;
import com.teampool.tournament.system.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private TournamentRepository tournamentRepository;

    // Adds a player to the database
    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    // Lists all players from the database
    @Override
    public List<Player> getAllUsers() {
        return playerRepository.findAll();
    }

    // Delete all players from database
    @Override
    public void deletePlayers() {
        playerRepository.deleteAll();
    }
    @Override
    public Player assignPlayerToTournament(Long playerId, Long tournamentId){
        Tournament tournament = tournamentRepository.findById(tournamentId).get();
        Player player = playerRepository.findById(tournamentId).get();
        player.assignTournament(tournament);
        return playerRepository.save(player);
    }

}





