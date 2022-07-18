package com.teampool.tournament.system.controller;

import com.teampool.tournament.system.model.Player;
import com.teampool.tournament.system.model.Tournament;
import com.teampool.tournament.system.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * Below is a list of endpoints for signing up user
 */
@RestController
@RequestMapping("/signup")
public class SignupController {

    // @Autowired tells application context to inject an instance of PlayerService
    @Autowired
    private PlayerService playerService;

    /*
    With @PostMapping, you specify the path then @RequestBody as you'll need a payload via postman
    declare parameters which are passed to PlayerService class and call method inserting parameter
     */
    @PostMapping("/userSignup")
    public String signUpUser(@RequestBody Player player) {
        playerService.savePlayer(player);
        return "New Player Signed Up!";
    }

    @GetMapping("/getUserById/{playerId}")
    public String getPlayerById(@PathVariable("playerId")Long playerId){
        return playerService.getPlayerById(playerId);
    }

    /*
    return a set of player objects with given tournament id as parameter
     */
    //TODO not working atm :)
//    @GetMapping("/getListOfPlayersTournament/{tournamentid}")
//    public List<Player> getAllPlayersTournamentId(@PathVariable("tournamentid") Long tournamentId){
//        return playerService.getListOfPlayersTournament(tournamentId);
//    }

    /*
    With @PutMapping, you just specify the path as you don't need a payload
    declare path parameters to pass them to the PlayerService class and call method
    The information will be fed in from the put request on postman

     */
    @PutMapping("/{playerId}/tournament/{tournamentId}")
    public Player assignPlayerToTournament(@PathVariable("playerId") Long playerId,
                                           @PathVariable("tournamentId") Long tournamentId) {
        return playerService.assignPlayerToTournament(playerId, tournamentId);
    }




    // return all players
    @GetMapping("/getAllUsers")
    public List<Player> getAllPlayers() {
        return playerService.getAllUsers();
    }

    // delete all players
    @DeleteMapping("/deleteAllUsers")
    public ResponseEntity deletePlayers() {
        playerService.deletePlayers();
        return ResponseEntity.ok().build();
    }


}
