package com.techreturners;

public class RomanNumeralsConverter {

    public Object convert(int decimalNumber) {
        char romanCharI = 'I';
        char romanCharV = 'V';
        String result = "";
        for (int i=0;i<decimalNumber;i++){
            result += romanCharI;
            int numberOfOccurence = countOccurence(result, romanCharI);
            if (numberOfOccurence > 3){
                result = String.valueOf(romanCharI)+String.valueOf(romanCharV);
            }
        }
        return result;
    }

    private int countOccurence(String result, char target) {
        int count = 0;
        for (char c : result.toCharArray()){
            if (c == target){
                count += 1;
            }
        }
        return count;
    }
}
