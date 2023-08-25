package com.techreturners;

public class RomanNumeralsConverter {

    public Object convert(int decimalNumber) {

        String[] romanChars = {"V","IV","I"};
        int[] decimalValues = {5,4,1};

        StringBuilder romanNumber = new StringBuilder();
        for (int i=0;i<decimalValues.length;i++){
            while(decimalNumber >= decimalValues[i]) {
                decimalNumber -= decimalValues[i];
                romanNumber.append(romanChars[i]);
            }
        }
        return romanNumber.toString();
    }
}
