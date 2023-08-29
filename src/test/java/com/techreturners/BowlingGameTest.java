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
        rollManyPins(20, 0);
        assertEquals(0, bowlingGame.calculateScore());
    }

    @Test
    public void checkWhenScoreIsAllOnes(){
        rollManyPins(20, 1);
        assertEquals(20, bowlingGame.calculateScore());
    }

    public void rollManyPins(int numberOfTimes, int score){
        for (int i=0; i < numberOfTimes; i++) {
            bowlingGame.rollPins(score);
        }
    }

    @Test
    public void checkWhenScoreHasASpare(){
        bowlingGame.rollPins(7);
        bowlingGame.rollPins(3);
        bowlingGame.rollPins(5);
        rollManyPins(17, 0);
        assertEquals(20, bowlingGame.calculateScore());
    }
}
