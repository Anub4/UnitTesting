package com.e.unittesting;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArithmeticTest {
    @Test
    public void testAddition(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 11;
        float actualResult = arithmetic.add(5,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSubtraction(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = -1;
        float actualResult = arithmetic.subtract(5,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDivision(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 0.5f;
        float actualResult = arithmetic.divide(5,10);
        assertEquals(expectedResult,actualResult);
    }


}
