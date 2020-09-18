package com.stevenroper.score.repository;

import com.stevenroper.score.model.Game;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDB(GameRepository gameRepo) {
        return args -> {
            log.info("Preloading " + gameRepo.save(new Game(100, true)));
        };
    }
}
