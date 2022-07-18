package com.teampool.tournament.system.service;
import com.teampool.tournament.system.model.Player;

import javax.persistence.SecondaryTable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Instance of PlayerService to be called by controller
 */
public interface PlayerService {
    public Player savePlayer(Player player);

    public List<Player> getAllUsers();

    public void deletePlayers();

    Player assignPlayerToTournament(Long playerId, Long tournamentId);


    String getPlayerById(Long playerId);

    List<Player> findPlayersByTournament(Long tournamentid);


}
