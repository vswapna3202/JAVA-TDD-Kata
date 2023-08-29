package com.techreturners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @BeforeEach
    public void setUp(){
        bowlingGame = new BowlingGame();
    }

    @Test
    public void checkWhenScoreIsAllZeros(){
        for (int i=0; i < 20; i++) {
            bowlingGame.rollPins(0);
        }
        assertEquals(0, bowlingGame.calculateScore());
    }
}
