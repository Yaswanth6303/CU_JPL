package org.example.MyMavenProject.classwork.Mar01;

import java.util.HashSet;
import java.util.Set;

/**
 * The {@code FibonacciSet} class provides methods to compute Fibonacci numbers
 * and store the generated values in a {@code Set}.
 *
 * <p>This class demonstrates both:</p>
 * <ul>
 *   <li>Iterative computation of the n-th Fibonacci number</li>
 *   <li>Recursive computation of the n-th Fibonacci number (without memoization)</li>
 *   <li>Storing all generated Fibonacci values in a {@code Set}</li>
 * </ul>
 *
 * <p>Note: {@code Set} is used here to hold distinct Fibonacci numbers.
 * Unlike a {@code Map}, it doesn't track which Fibonacci number corresponds to which index.</p>
 */
public class FibonacciSet {

    private Set<Integer> fibSet;

    /**
     * Constructs a new {@code FibonacciSet} object with an empty set.
     */
    public FibonacciSet() {
        this.fibSet = new HashSet<>();
    }

    /**
     * Computes the n-th Fibonacci number using iteration and stores all generated values in the set.
     *
     * @param n the index of the Fibonacci number to compute (0-based)
     * @return the n-th Fibonacci number
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public Integer getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        fibSet.add(0);
        if (n == 0) return 0;

        fibSet.add(1);
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int fibValue = 1;

        for (int i = 2; i <= n; i++) {
            fibValue = a + b;
            fibSet.add(fibValue);
            a = b;
            b = fibValue;
        }

        return fibValue;
    }

    /**
     * Computes the n-th Fibonacci number recursively (inefficient version) and adds it to the set.
     *
     * <p>This method does not use memoization, so it's not efficient for large values of {@code n}.</p>
     *
     * @param n the index of the Fibonacci number to compute (0-based)
     * @return the n-th Fibonacci number
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public Integer getNthFibonacciRecursion(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n <= 1) {
            fibSet.add(n);
            return n;
        }

        int fibValue = getNthFibonacciRecursion(n - 1) + getNthFibonacciRecursion(n - 2);
        fibSet.add(fibValue);

        return fibValue;
    }

    public static void main(String[] args) {
        FibonacciSet fib = new FibonacciSet();

        System.out.println(fib.getNthFibonacci(5));
        System.out.println(fib.getNthFibonacciRecursion(5));
    }
}
