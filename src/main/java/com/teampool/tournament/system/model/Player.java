package com.teampool.tournament.system.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Basic model class
 * Entity marks the class to be created as a table within database
 *
 */
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long playerId;
    private String username;
    private String password;
    private long matchesWon;
    private long tournamentsWon;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tournamentid", referencedColumnName = "tournamentId")
    private Tournament tournament;

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public long getTournamentsWon() {
        return tournamentsWon;
    }

    public void setTournamentsWon(int tournamentsWon) {
        this.tournamentsWon = tournamentsWon;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public void assignTournament(Tournament tournament){
        this.tournament = tournament;
    }
}
