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

}
