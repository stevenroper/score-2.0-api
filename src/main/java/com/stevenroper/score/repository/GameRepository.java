package com.stevenroper.score.repository;

import com.stevenroper.score.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

interface GameRepository extends JpaRepository<Game, UUID> {
}
