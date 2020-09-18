package com.stevenroper.score.resource;

import com.stevenroper.score.model.Game;
import com.stevenroper.score.service.GameService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@AllArgsConstructor
@RestController
class GameResource {
    private final GameService gameService;

    @PostMapping("/games")
    Game create(@RequestBody Game newGame) {
        return gameService.createGame(newGame);
    }
}
