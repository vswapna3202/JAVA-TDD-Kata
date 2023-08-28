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
        assertEquals("I", romanNumeralsConverter.convert(1));
    }

    @Test
    public void convertTwoToRomanNumber(){
        assertEquals("II", romanNumeralsConverter.convert(2));
    }

    @Test
    public void convertThreeToNumber(){
        assertEquals("III", romanNumeralsConverter.convert(3));
    }

    @Test
    public void convertFourToRomanNumber(){
        assertEquals("IV", romanNumeralsConverter.convert(4));
    }

    @Test
    public void convertFiveToRomanNumber(){
        assertEquals("V", romanNumeralsConverter.convert(5));
    }

    @Test
    public void convertEightToRomanNumber(){
        assertEquals("VIII", romanNumeralsConverter.convert(8));
    }

    @Test
    public void convertNineToRomanNumber(){
        assertEquals("IX", romanNumeralsConverter.convert(9));
    }

    @Test
    public void convertTenToRomanNumber(){
        assertEquals("X", romanNumeralsConverter.convert(10));
    }

    @Test
    public void convertThirtyToRomanNumber(){
        assertEquals("XXX", romanNumeralsConverter.convert(30));
    }

    @Test
    public void convertFortyToRomanNumber(){
        assertEquals("XL", romanNumeralsConverter.convert(40));
    }

    @Test
    public void convertFiftyToRomanNumber(){
        assertEquals("L", romanNumeralsConverter.convert(50));
    }

    @Test
    public void convertNinetyToRomanNumber(){
        assertEquals("XC", romanNumeralsConverter.convert(90));
    }

    @Test
    public void convertHundredToRomanNumber(){
        assertEquals("C", romanNumeralsConverter.convert(100));
    }

    @Test
    public void convertFourHundredToRomanNumber(){
        assertEquals("CD", romanNumeralsConverter.convert(400));
    }

    @Test
    public void convertFiveHundredToRomanNumber(){
        assertEquals("D", romanNumeralsConverter.convert(500));
    }

    @Test
    public void convertNineHundredToRomanNumber(){
        assertEquals("CM", romanNumeralsConverter.convert(900));
    }

    @Test
    public void convertOneThousandToRomanNumber(){
        assertEquals("M", romanNumeralsConverter.convert(1000));
    }

    @Test
    public void convertTwoThousandNineHundredAndNinetyNineToRomanNumber(){
        assertEquals("MMCMXCIX", romanNumeralsConverter.convert(2999));
    }

    @Test
    public void checkZeroAsInvalidInputForRomanNumberConversion(){
        assertEquals("Invalid Input!", romanNumeralsConverter.convert(0));
    }

    @Test
    public void checkNegativeNumberAsInvalidInputForRomanNumberConversion(){
        assertEquals("Invalid Input!", romanNumeralsConverter.convert(-10));
    }

    @Test
    public void checkNumberGreateThan3999AsInvalidInputForRomanNumberConversion(){
        assertEquals("Invalid Input!", romanNumeralsConverter.convert(4000));
    }

    @Test
    public void convertNumber3999ToRomanNumber(){
        assertEquals("MMMCMXCIX", romanNumeralsConverter.convert(3999));
    }
}
