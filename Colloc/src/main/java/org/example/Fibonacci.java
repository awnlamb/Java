package org.example;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    Fibonacci () {}
    public static List<Integer> generateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        List<Integer> fibonacci = new ArrayList<>();
        if (n >= 1) fibonacci.add(0);
        if (n >= 2) fibonacci.add(1);

        for (int i = 2; i < n; i++) {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }

        return fibonacci;
    }

    public static void print0(int n)
    {
        System.out.println(generateFibonacci(n));
    }
}
