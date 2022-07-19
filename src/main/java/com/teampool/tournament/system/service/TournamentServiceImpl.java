package com.teampool.tournament.system.service;

import com.teampool.tournament.system.model.Player;
import com.teampool.tournament.system.model.Tournament;
import com.teampool.tournament.system.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TournamentServiceImpl implements TournamentService {
    @Autowired
    private TournamentRepository tournamentRepository;
    @Override
    public Tournament createTournament(Tournament tournament){
        return tournamentRepository.save(tournament);
    }

    @Override
    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }


    // returns set of player objects using tournament id as search criteria
    @Override
    public Set<Player> getListOfPlayers(Long tournamentid) {

        Tournament tournament = tournamentRepository.findById(tournamentid).get();

        return tournament.getPlayers();
    }





}

