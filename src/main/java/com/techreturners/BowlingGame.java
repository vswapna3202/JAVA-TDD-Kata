package com.techreturners;

public class BowlingGame {
    private int[] bowlingScores = new int[21];
    int index = 0;
    public void rollPins(int score){
        bowlingScores[index++] = score;
    }

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

    private boolean isaStrike(int scoreIndex) {
        return bowlingScores[scoreIndex] == 10;
    }

    private boolean isaSpare(int scoreIndex) {
        return bowlingScores[scoreIndex] + bowlingScores[scoreIndex + 1] == 10;
    }

}
