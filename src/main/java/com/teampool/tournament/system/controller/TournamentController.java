package com.teampool.tournament.system.controller;


import com.teampool.tournament.system.model.Player;
import com.teampool.tournament.system.model.Tournament;
import com.teampool.tournament.system.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/tournament")

public class TournamentController {


    @Autowired
    private TournamentService tournamentService;

    // adds tournament to database
    @PostMapping("/addTournament")
    public String add(@RequestBody Tournament tournament) {
        tournamentService.createTournament(tournament);
        return "New Tournament Created";
    }
    // returns a list of all tournaments added
    @GetMapping("/getAllTournaments")
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    //TODO
    @GetMapping("/getPlayersUsingTournamentId")
    public Set<String> getPlayersUsingTournamentId(Long tournamentId){

        return null; 
    }



}
