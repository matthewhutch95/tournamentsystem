package com.teampool.tournament.system.service;
import com.teampool.tournament.system.model.Player;

import java.util.List;

/**
 * Instance of PlayerService to be called by controller
 */
public interface PlayerService {
    public Player savePlayer(Player player);

    public List<Player> getAllUsers();

    public void deletePlayers();

    Player assignPlayerToTournament(Long playerId, Long tournamentId);





}
