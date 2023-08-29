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

    @Test
    public void checkWhenScoreHasASpare(){
        rollSpare();
        bowlingGame.rollPins(5);
        rollManyPins(17, 0);
        assertEquals(20, bowlingGame.calculateScore());
    }

    @Test
    public void checkWhenScoreIsAStrike(){
        rollStrike();
        bowlingGame.rollPins(3);
        bowlingGame.rollPins(4);
        rollManyPins(16, 0);
        assertEquals(24, bowlingGame.calculateScore());
    }

    @Test
    public void checkWhenTwelveStrikes(){
        rollManyPins(12, 10);
        assertEquals(300,bowlingGame.calculateScore());
    }

    @Test
    public void checkWhenNineHitsAndOneMiss(){
        for(int i=0; i < 10; i++) {
            bowlingGame.rollPins(9);
            bowlingGame.rollPins(0);
        }
        assertEquals(90,bowlingGame.calculateScore());
    }

    @Test
    public void checkWhenAllFivesAndSpareAndOneExtraFive(){
        for(int i=0; i < 10; i++) {
            bowlingGame.rollPins(5);
            bowlingGame.rollPins(5);
        }
        bowlingGame.rollPins(5);
        assertEquals(150,bowlingGame.calculateScore());
    }

    @Test
    public void checkFullGame(){
        //Frame 1 Input
        bowlingGame.rollPins(1);
        bowlingGame.rollPins(4);
        //Frame 2 Input
        bowlingGame.rollPins(4);
        bowlingGame.rollPins(5);
        //Frame 3 Input
        bowlingGame.rollPins(6);
        bowlingGame.rollPins(4);
        //Frame 4 Input
        bowlingGame.rollPins(5);
        bowlingGame.rollPins(5);
        //Frame 5 Input - Strike
        rollStrike();
        //Frame 6 Input
        bowlingGame.rollPins(0);
        bowlingGame.rollPins(1);
        //Frame 7 Input
        rollSpare();
        //Frame 8 Input
        bowlingGame.rollPins(6);
        bowlingGame.rollPins(4);
        //Frame 9 Input
        rollStrike();
        //Frame 10 Input
        bowlingGame.rollPins(2);
        bowlingGame.rollPins(8);
        bowlingGame.rollPins(6);
        assertEquals(133,bowlingGame.calculateScore());
    }

    public void rollStrike(){
        bowlingGame.rollPins(10);
    }

    public void rollManyPins(int numberOfTimes, int score){
        for (int i=0; i < numberOfTimes; i++) {
            bowlingGame.rollPins(score);
        }
    }

    public void rollSpare(){
        bowlingGame.rollPins(7);
        bowlingGame.rollPins(3);
    }

}
