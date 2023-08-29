package com.techreturners;

public class BowlingGame {
    private int[] bowlingScores = new int[20];
    private int index = 0;
    public void rollPins(int score){
        bowlingScores[index++] = score;
    }

    public int calculateScore(){
        int score = 0;
        for (int i=0;i< bowlingScores.length;i++){
            score += bowlingScores[i];
        }
        return score;
    }
}
