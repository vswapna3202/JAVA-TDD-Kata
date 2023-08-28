package com.techreturners;

import java.util.InputMismatchException;

public class RomanNumeralsConverter {

    public String convert(int decimalNumber) {
        try {
            if (decimalNumber <= 0 || decimalNumber > 3999) {
                return "Invalid Input!";
            }

            String[] romanChars = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

            StringBuilder romanNumber = new StringBuilder();
            for (int i = 0; i < decimalValues.length; i++) {
                while (decimalNumber >= decimalValues[i]) {
                    decimalNumber -= decimalValues[i];
                    romanNumber.append(romanChars[i]);
                }
            }
            return romanNumber.toString();
        }catch(InputMismatchException ime){
            return("Invalid Input!");
        }
    }
}
