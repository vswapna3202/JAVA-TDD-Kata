package com.techreturners;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    private static RomanNumeralsConverter romanNumeralsConverter;
    @BeforeAll
    public static void setUpBeforeAll(){
        romanNumeralsConverter = new RomanNumeralsConverter();
    }

    @Test
    public void convertOneToRomanNumber(){
        assertEquals("I", romanNumeralsConverter.convertToRoman(1));
    }

    @Test
    public void convertTwoToRomanNumber(){
        assertEquals("II", romanNumeralsConverter.convertToRoman(2));
    }

    @Test
    public void convertThreeToNumber(){
        assertEquals("III", romanNumeralsConverter.convertToRoman(3));
    }

    @Test
    public void convertFourToRomanNumber(){
        assertEquals("IV", romanNumeralsConverter.convertToRoman(4));
    }

    @Test
    public void convertFiveToRomanNumber(){
        assertEquals("V", romanNumeralsConverter.convertToRoman(5));
    }

    @Test
    public void convertEightToRomanNumber(){
        assertEquals("VIII", romanNumeralsConverter.convertToRoman(8));
    }

    @Test
    public void convertNineToRomanNumber(){
        assertEquals("IX", romanNumeralsConverter.convertToRoman(9));
    }

    @Test
    public void convertTenToRomanNumber(){
        assertEquals("X", romanNumeralsConverter.convertToRoman(10));
    }

    @Test
    public void convertThirtyToRomanNumber(){
        assertEquals("XXX", romanNumeralsConverter.convertToRoman(30));
    }

    @Test
    public void convertFortyToRomanNumber(){
        assertEquals("XL", romanNumeralsConverter.convertToRoman(40));
    }

    @Test
    public void convertFiftyToRomanNumber(){
        assertEquals("L", romanNumeralsConverter.convertToRoman(50));
    }

    @Test
    public void convertNinetyToRomanNumber(){
        assertEquals("XC", romanNumeralsConverter.convertToRoman(90));
    }

    @Test
    public void convertHundredToRomanNumber(){
        assertEquals("C", romanNumeralsConverter.convertToRoman(100));
    }

    @Test
    public void convertFourHundredToRomanNumber(){
        assertEquals("CD", romanNumeralsConverter.convertToRoman(400));
    }

    @Test
    public void convertFiveHundredToRomanNumber(){
        assertEquals("D", romanNumeralsConverter.convertToRoman(500));
    }

    @Test
    public void convertNineHundredToRomanNumber(){
        assertEquals("CM", romanNumeralsConverter.convertToRoman(900));
    }

    @Test
    public void convertOneThousandToRomanNumber(){
        assertEquals("M", romanNumeralsConverter.convertToRoman(1000));
    }

    @Test
    public void convertTwoThousandNineHundredAndNinetyNineToRomanNumber(){
        assertEquals("MMCMXCIX", romanNumeralsConverter.convertToRoman(2999));
    }

    @Test
    public void checkZeroAsInvalidInputForRomanNumberConversion(){
        assertEquals("Invalid Input!", romanNumeralsConverter.convertToRoman(0));
    }

    @Test
    public void checkNegativeNumberAsInvalidInputForRomanNumberConversion(){
        assertEquals("Invalid Input!", romanNumeralsConverter.convertToRoman(-10));
    }

    @Test
    public void checkNumberGreateThan3999AsInvalidInputForRomanNumberConversion(){
        assertEquals("Invalid Input!", romanNumeralsConverter.convertToRoman(4000));
    }

    @Test
    public void convertNumber3999ToRomanNumber(){
        assertEquals("MMMCMXCIX", romanNumeralsConverter.convertToRoman(3999));
    }

    @Test
    public void convertRomanNumberToDecimal(){
        assertEquals(3999, romanNumeralsConverter.convertToDecimal("MMMCMXCIX"));
    }
}
