package com.techreturners;

public class RomanNumeralsConverter {

    public Object convert(int decimalNumber) {
        String result = "";
        for (int i=0;i<decimalNumber;i++){
            result += "I";
        }
        return result;
    }
}
