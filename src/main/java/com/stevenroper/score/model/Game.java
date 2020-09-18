package com.stevenroper.score.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Game {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private int endingPoints;
    private boolean pointsAreGood;

    Game() {}

    public Game(int endingPoints, boolean pointsAreGood) {
        this.endingPoints = endingPoints;
        this.pointsAreGood = pointsAreGood;
    }
}
