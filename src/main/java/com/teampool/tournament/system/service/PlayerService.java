package com.teampool.tournament.system.service;
import com.teampool.tournament.system.model.Player;
import java.util.List;

public interface PlayerService {
    public Player savePlayer(Player player);

    public List<Player> getAllPlayers();

    public void deletePlayers();


}
