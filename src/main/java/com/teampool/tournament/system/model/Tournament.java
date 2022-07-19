package com.teampool.tournament.system.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Tournament {
    @Id
    @GeneratedValue
    private long tournamentId;

    @JsonIgnore
    @OneToMany(mappedBy ="tournament")
    private Set<Player> players = new HashSet<>();
    private String tournamentName;
    private long roundNo;
    private long matchNo;
    private long winnerId;

    public void addPlayer(Player player){
        players.add(player);
    }

    public long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(long tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public long getRoundNo() {
        return roundNo;
    }

    public void setRoundNo(long roundNo) {
        this.roundNo = roundNo;
    }

    public long getMatchNo() {
        return matchNo;
    }

    public void setMatchNo(long matchNo) {
        this.matchNo = matchNo;
    }

    public long getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(long winnerId) {
        this.winnerId = winnerId;
    }
}
