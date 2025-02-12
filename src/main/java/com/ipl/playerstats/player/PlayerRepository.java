package com.ipl.playerstats.player;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, String> {

    void deleteByName(String name);
    Optional<Player> findByName(String name);

}
