package com.teampool.tournament.system.controller;


import com.teampool.tournament.system.model.Tournament;
import com.teampool.tournament.system.model.User;
import com.teampool.tournament.system.service.TournamentService;
import com.teampool.tournament.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournament")

public class EventController {



    @Autowired
    private TournamentService tournamentService;

    //public Tournament addTournament(@RequestBody)


    @PostMapping("/addTournament")
    public String add(@RequestBody Tournament tournament) {
        tournamentService.createTournament(tournament);
        return "New Tournament Created";
    }
    @GetMapping("/getAll")
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();


    }






}
