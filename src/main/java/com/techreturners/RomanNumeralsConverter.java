package com.techreturners;

import java.util.InputMismatchException;

public class RomanNumeralsConverter {

    private static String[]  romanChars = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static int[]  decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    /* This method checks if decimal number is in range 1 to 3999 and
    converts it to a Roman Number
     */
    public static String convertToRoman(int decimalNumber) {
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

    /* This method checks if input is not null, empty or invalid Roman
    alphabets and if valid converts it to decimal Number
     */
    public static int convertToDecimal(String romanNumber){
        if (isValidRoman(romanNumber)) {
            int decimalNumber =0;
            int index = 0;
            while (index < romanNumber.length()) {
                for (int i = 0; i < romanChars.length; i++) {
                    String currentSymbol = romanChars[i];
                    while (romanNumber.startsWith(currentSymbol, index)) {
                        decimalNumber += decimalValues[i];
                        index += currentSymbol.length();
                    }
                }
            }
            return decimalNumber;
        }else {
            return -1;
        }
    }

    public static boolean isValidRoman(String romanNumber){
        if (romanNumber == null || romanNumber.isEmpty()){
            return false;
        }
        final String VALID_ROMAN_CHARACTERS = "IVXLCDM";
        for (char c : romanNumber.toCharArray()){
            if (VALID_ROMAN_CHARACTERS.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }

}
