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

    /*
    Tests total score is 0 when all score values are 0
     */
    @Test
    public void testAllZeros(){
        rollManyPins(20, 0);
        assertEquals(0, bowlingGame.calculateScore());
    }

    /*
    Tests total score is 20 when all the score values are 1
     */
    @Test
    public void testAllOnes(){
        rollManyPins(20, 1);
        assertEquals(20, bowlingGame.calculateScore());
    }

    /*
    Tests when spare scores are 7,3 and next score is 5. So total
    score should be 20.
     */
    @Test
    public void testSpare(){
        rollSpare();
        bowlingGame.rollPins(5);
        rollManyPins(17, 0);
        assertEquals(20, bowlingGame.calculateScore());
    }

    /*
    Tests when strike and next scores are 3 and 4 so total score
    should be 24
     */
    @Test
    public void testStrike(){
        rollStrike();
        bowlingGame.rollPins(3);
        bowlingGame.rollPins(4);
        rollManyPins(16, 0);
        assertEquals(24, bowlingGame.calculateScore());
    }

    /*
    Test for a perfect game where strikes are scored for all
    12 games and total score should be 300
     */
    @Test
    public void testPerfectGame(){
        rollManyPins(12, 10);
        assertEquals(300,bowlingGame.calculateScore());
    }

    /*
    Test for 10 pairs of 9s and misses for each pair and total score
    should be 90
     */
    @Test
    public void testNineAndMiss(){
        for(int i=0; i < 10; i++) {
            bowlingGame.rollPins(9);
            bowlingGame.rollPins(0);
        }
        assertEquals(90,bowlingGame.calculateScore());
    }

    /*
    Tests for all Fives with Spare and an extra five where
    total score should be 150
     */
    @Test
    public void testAllFivesSpareAndExtraFive(){
        for(int i=0; i < 10; i++) {
            bowlingGame.rollPins(5);
            bowlingGame.rollPins(5);
        }
        bowlingGame.rollPins(5);
        assertEquals(150,bowlingGame.calculateScore());
    }

    /*
    Give varied inputs of scores with miss, spare and strikes
    to get total score for a custom game with mixed input
     */
    @Test
    public void testCustomGame(){
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

    /*
    This method rolls Pin to get a perfect score of 10 which is a strike
     */
    public void rollStrike(){
        bowlingGame.rollPins(10);
    }

    /*
    This method rolls Pins numberOfTimes specified and assigns score
     */
    public void rollManyPins(int numberOfTimes, int score){
        for (int i=0; i < numberOfTimes; i++) {
            bowlingGame.rollPins(score);
        }
    }

    /*
    This method rolls a spare with total score of 10 with two tries
     */
    public void rollSpare(){
        bowlingGame.rollPins(7);
        bowlingGame.rollPins(3);
    }

}
