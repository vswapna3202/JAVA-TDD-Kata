package com.techreturners;

public class BowlingGame {
    private int[] bowlingScores = new int[21];
    int index = 0;

    /*
    This method assigns the parameter score to bowlingScores Array
    holding all the scores of a game
     */
    public void rollPins(int score){
        bowlingScores[index++] = score;
    }

    /*
    This method calculates the total score by a player. It checks for spare,
    strike and scores with misses for all 10 frames and returns the score
     */
    public int calculateScore(){
        int score = 0;
        int frameLength = 10;
        int scoreIndex = 0;
        for (int i=0; i < frameLength; i++){
            if (isaStrike(scoreIndex)){
                //this is a strike
                score += 10 + bowlingScores[scoreIndex + 1]
                        + bowlingScores [scoreIndex + 2];
                scoreIndex++;
            } else if (isaSpare(scoreIndex)){
                //this is a spare
                score += 10 + bowlingScores[scoreIndex+2];
                scoreIndex += 2;
            } else {
                //this has a miss
                score += bowlingScores[scoreIndex] + bowlingScores[scoreIndex+1];
                scoreIndex += 2;
            }
        }
        return score;
    }

    /*
    This checks if bowlingScores at index scoreIndex is 10 which means a
    strike has been scored
     */
    private boolean isaStrike(int scoreIndex) {
        return bowlingScores[scoreIndex] == 10;
    }

    /*
    This checks if sum of bowlingScores at scoreIndex and scoreIndex + 1 is
    equal to 10 which means a spare was scored in 2 tries
     */
    private boolean isaSpare(int scoreIndex) {
        return bowlingScores[scoreIndex] + bowlingScores[scoreIndex + 1] == 10;
    }

}
