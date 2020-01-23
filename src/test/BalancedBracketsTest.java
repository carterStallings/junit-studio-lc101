package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets test_object;
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testTwo() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testThree() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testFour() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("car[ter]"));
    }

    @Test
    public void testFive() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("s]"));
    }

    @Test
    public void testSix() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    @Test
    public void testSeven() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]4"));
    }

    @Test
    public void testEight() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("aaaa"));
    }

    @Test
    public void testNine() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("AAA"));
    }

    @Test
    public void testTen() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testEleven() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void testTwelve() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
}
