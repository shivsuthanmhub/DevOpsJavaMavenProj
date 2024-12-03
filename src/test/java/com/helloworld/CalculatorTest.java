package com.helloworld;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 10", 10, test.addition(5,5));
    }

    @Test
    public void testSubtraction() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 3", 3, test.subtraction(5,2));
    }

    @Test
    public void testMultiplication() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 6", 6, test.multiplication(2,3));
    }

    @Test
    public void testDivision() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 2", 2, test.division(8,4));
    }
}
