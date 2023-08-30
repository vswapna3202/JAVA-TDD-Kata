package com.techreturners;

import java.util.InputMismatchException;

public class RomanNumeralsConverter {

    private static String[]  romanChars = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static int[]  decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String convertToRoman(int decimalNumber) {
        try {
            if (decimalNumber <= 0 || decimalNumber > 3999) {
                return "Invalid Input!";
            }

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

    public int convertToDecimal(String romanNumber){
        if (romanNumber == null || romanNumber.isEmpty()){
            throw new IllegalArgumentException("Invalid Input!");
        }
        int decimalNumber =0;
        int index = 0;

        while (index < romanNumber.length()){
            for (int i=0; i < romanChars.length; i++){
                String currentSymbol = romanChars[i];
                while(romanNumber.startsWith(currentSymbol, index)){
                    decimalNumber += decimalValues[i];
                    index += currentSymbol.length();
                }
            }
        }
        return decimalNumber;
    }

}
