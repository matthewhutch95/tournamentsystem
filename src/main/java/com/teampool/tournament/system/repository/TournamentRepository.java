package com.teampool.tournament.system.repository;

import com.teampool.tournament.system.model.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Repository class
 * Standard way of persisting Java objects into a relational database
 */
@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long> {


    }



