package org.example.MyMavenProject.classwork.Mar01;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code FibonacciMap} class provides methods to compute and store Fibonacci numbers.
 *
 * <p>This class demonstrates both:</p>
 * <ul>
 *   <li>Generating the first N Fibonacci numbers iteratively into a {@code Map}</li>
 *   <li>Computing the N-th Fibonacci number recursively using memoization (top-down DP)</li>
 * </ul>
 */
public class FibonacciMap {

    /**
     * A memoization map to store already computed Fibonacci values
     * for efficient recursive retrieval.
     */
    private Map<Integer, Integer> fibMap;

    /**
     * Constructs a new {@code FibonacciMap} object with an empty memoization map.
     */
    public FibonacciMap() {
        this.fibMap = new HashMap<>();
    }

    /**
     * Generates a map of the first {@code n} Fibonacci numbers using iteration.
     *
     * @param n the number of Fibonacci terms to generate
     * @return a map where keys are indices (starting from 0) and values are the corresponding Fibonacci numbers
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public Map<Integer, Integer> generateFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        Map<Integer, Integer> fibMap = new HashMap<>();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            fibMap.put(i, a);
            int next = a + b;
            a = b;
            b = next;
        }

        return fibMap;
    }

    /**
     * Recursively computes the n-th Fibonacci number using memoization.
     *
     * @param n the index of the Fibonacci number to compute
     * @return the n-th Fibonacci number
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public Integer getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n <= 1) {
            return n;
        }

        if (fibMap.containsKey(n)) {
            return fibMap.get(n);
        }

        int fibValue = getNthFibonacci(n - 1) + getNthFibonacci(n - 2);
        fibMap.put(n, fibValue);

        return fibValue;
    }

    public static void main(String[] args) {
        FibonacciMap getNthFib = new FibonacciMap();
        System.out.println(getNthFib.getNthFibonacci(5));
    }
}
