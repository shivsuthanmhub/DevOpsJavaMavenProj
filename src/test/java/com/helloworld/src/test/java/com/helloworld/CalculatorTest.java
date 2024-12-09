package com.helloworld.src.test.java.com.helloworld;

import org.junit.Assert;
import org.junit.Test;
import com.helloworld.Calculator; // added comments

public class CalculatorTest {

    @Test
    public void testSubtraction() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 2", 2, test.subtraction(6,4));
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
