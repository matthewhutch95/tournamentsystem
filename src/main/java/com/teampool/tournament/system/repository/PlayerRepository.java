package com.teampool.tournament.system.repository;

import com.teampool.tournament.system.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository class
 * Standard way of persisting Java objects into a relational database
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    //TODO not currently working, comment out with relating errors to run application
    @Query
    List<Player> findByTournamentId(Long tournamentid);
}
