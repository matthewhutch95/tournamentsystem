package com.teampool.tournament.system.service;

import com.teampool.tournament.system.model.Player;
import com.teampool.tournament.system.model.Tournament;


import java.util.List;
import java.util.Set;


public interface TournamentService {
    public Tournament createTournament(Tournament tournament);

    public List<Tournament> getAllTournaments();


    public Set<Player> getListOfPlayers(Long tournamentid);
}
