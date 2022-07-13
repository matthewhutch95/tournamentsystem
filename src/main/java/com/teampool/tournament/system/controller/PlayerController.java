package com.teampool.tournament.system.controller;


import com.teampool.tournament.system.model.Player;
import com.teampool.tournament.system.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @PostMapping("/add")
    public String add(@RequestBody Player player) {
        playerService.savePlayer(player);
        return "New Player Signed Up!";
    }

    @GetMapping("/getAll")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();


    }

    @DeleteMapping("/deleteAllPlayers")
    public ResponseEntity deletePlayers(){
        playerService.deletePlayers();
        return ResponseEntity.ok().build();
    }




}
