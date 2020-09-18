package com.stevenroper.score.service;

import com.stevenroper.score.model.Game;
import com.stevenroper.score.repository.GameRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GameService {
    private final GameRepository gameRepo;

    public Game createGame(Game newGame) {
        return gameRepo.save(newGame);
    }
}
