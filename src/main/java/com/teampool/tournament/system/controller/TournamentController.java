package com.teampool.tournament.system.controller;


import com.teampool.tournament.system.model.Player;
import com.teampool.tournament.system.model.Tournament;
import com.teampool.tournament.system.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin
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
   @GetMapping("/findTournamentById/{tournamentid}")
   public Tournament findTournamentById(@PathVariable Long tournamentid) {
        return tournamentService.findById(tournamentid);
   }

    // returns a list of all tournaments added
    @GetMapping("/getAllTournaments")
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GetMapping("/getPlayersUsingTournamentId/{tournamentId}")
    public Set<Player> getPlayersUsingTournamentId(@PathVariable Long tournamentId) {
        return tournamentService.getListOfPlayers(tournamentId);

    }


}

