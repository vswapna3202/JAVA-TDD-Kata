package com.techreturners;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {
    @Test
    public void checkZeroAsInvalidInputForRomanNumberConversion(){
        assertEquals("Invalid Input!", RomanNumeralsConverter.convertToRoman(0));
    }

    @Test
    public void checkNegativeNumberAsInvalidInputForRomanNumberConversion(){
        assertEquals("Invalid Input!", RomanNumeralsConverter.convertToRoman(-10));
    }

    @Test
    public void checkNumberGreateThan3999AsInvalidInputForRomanNumberConversion(){
        assertEquals("Invalid Input!", RomanNumeralsConverter.convertToRoman(4000));
    }

    @Test
    public void checkWhenRomanNumberIsNull(){
        assertEquals(-1, RomanNumeralsConverter.convertToDecimal(null));
    }

    @Test
    public void checkWhenRomanNumberIsEmpty(){
        assertEquals(-1, RomanNumeralsConverter.convertToDecimal(""));
    }

    @Test
    public void checkWhenRomanNumberHasWrongAlphabets(){
        assertEquals(-1, RomanNumeralsConverter.convertToDecimal("MKJHIO"));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/romanNumerals.csv")
    public void checkRomanNumberConversion(int decimalNumber, String romanNumber){
        System.out.printf("Input: %d, Expected: %s\n", decimalNumber, romanNumber);
        assertEquals (romanNumber, RomanNumeralsConverter.convertToRoman(decimalNumber));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/romanNumerals.csv")
    public void checkDecimalNumberConversion(int decimalNumber, String romanNumber){
        System.out.printf("Input: %s, Expected: %d\n", romanNumber, decimalNumber);
        assertEquals (decimalNumber, RomanNumeralsConverter.convertToDecimal(romanNumber));
    }
}
