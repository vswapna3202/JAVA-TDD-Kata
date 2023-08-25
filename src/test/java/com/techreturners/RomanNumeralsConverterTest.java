package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    @Test
    public void convertOneToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("I", romanNumeralsConverter.convert(1));
    }

    @Test
    public void convertTwoToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("II", romanNumeralsConverter.convert(2));
    }

    @Test
    public void convertThreeToNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("III", romanNumeralsConverter.convert(3));
    }

    @Test
    public void convertFourToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IV", romanNumeralsConverter.convert(4));
    }

    @Test
    public void convertFiveToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("V", romanNumeralsConverter.convert(5));
    }

    @Test
    public void convertEightToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("VIII", romanNumeralsConverter.convert(8));
    }

    @Test
    public void convertNineToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IX", romanNumeralsConverter.convert(9));
    }

    @Test
    public void convertTenToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("X", romanNumeralsConverter.convert(10));
    }

    @Test
    public void convertThirtyToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XXX", romanNumeralsConverter.convert(30));
    }

    @Test
    public void convertFortyToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XL", romanNumeralsConverter.convert(40));
    }

    @Test
    public void convertFiftyToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("L", romanNumeralsConverter.convert(50));
    }

    @Test
    public void convertNinetyToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XC", romanNumeralsConverter.convert(90));
    }

    @Test
    public void convertHundredToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("C", romanNumeralsConverter.convert(100));
    }

    @Test
    public void convertFourHundredToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("CD", romanNumeralsConverter.convert(400));
    }

    @Test
    public void convertFiveHundredToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("D", romanNumeralsConverter.convert(500));
    }

    @Test
    public void convertNineHundredToRomanNumber(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("CM", romanNumeralsConverter.convert(900));
    }
}
