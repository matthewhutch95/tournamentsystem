package com.teampool.tournament.system.repository;

import com.teampool.tournament.system.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Repository class
 * Standard way of persisting Java objects into a relational database
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Query(value = "SELECT * FROM player WHERE tournamentid = ?1", nativeQuery = true)
    List<Player> findPlayersByTournament(Long tournamentId);

}
