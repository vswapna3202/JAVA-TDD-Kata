package com.techreturners;

public class BowlingGame {
    private int[] bowlingScores = new int[20];
    private int index = 0;

    public void rollPins(int score){
        bowlingScores[index++] = score;
    }

    public int calculateScore(){
        int score = 0;
        int frameLength = 10;
        int scoreIndex = 0;
        for (int i = 0; i < frameLength; i++){
            if (bowlingScores[scoreIndex] + bowlingScores[scoreIndex + 1] == 10){
                //this is a spare
                score += 10 + bowlingScores [scoreIndex + 2];
                scoreIndex += 2;
            } else {
                // this is a miss case
                score += bowlingScores[scoreIndex] + bowlingScores[scoreIndex + 1];
                scoreIndex += 2;
            }
        }
        return (score);
    }

}
