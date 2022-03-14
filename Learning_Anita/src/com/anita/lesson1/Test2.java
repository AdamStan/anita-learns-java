package com.anita.lesson1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Results comes from: https://www.calculatorsoup.com/calculators/discretemathematics/factorials.php
 */
public class Test2 {

    @Test
    public void test_factorial1() {
        long result = Task2.factorialIterate(10);
        long expected = 3628800;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test_factorial2() {
        long result = Task2.factorialIterate(12);
        long expected = 479001600;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test_factorial3() {
        long result = Task2.factorialIterate(16);
        long expected = 20922789888000L;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test_factorial4() {
        long result = Task2.factorialIterate(20);
        long expected = 2432902008176640000L;
        Assertions.assertEquals(expected, result);
    }

//    @Test
//    public void test_factorial5() {
//        long result = Task2.factorialIterate(21);
//        long expected = 51090942171709440000L;
//        Assertions.assertEquals(expected, result);
//    }

}
