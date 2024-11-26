package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FibonacciTest {
    @Test
    public void testGenerateFibonacci0() {
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        assertEquals(expected, Fibonacci.generateFibonacci(10));
    }
    @Test
    public void testGenerateFibonacci1() {
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        assertEquals(expected, Fibonacci.generateFibonacci(11));
    }
    @Test
    public void testGenerateFibonacci2() {
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
        assertEquals(expected, Fibonacci.generateFibonacci(12));
    }
    @Test
    public void testGenerateFibonacciInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.generateFibonacci(-1));
    }
}
