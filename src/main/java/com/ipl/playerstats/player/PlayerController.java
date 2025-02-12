package com.ipl.playerstats.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }
    @GetMapping("/{id}")
    public Player getById(@PathVariable Long id){
        return playerService.findById(id);
    }
    @GetMapping("/batsman/{batsman}")
    public Player getByBatsman(@PathVariable String batsman){
        return playerService.getBatsman(batsman);
    }

}
