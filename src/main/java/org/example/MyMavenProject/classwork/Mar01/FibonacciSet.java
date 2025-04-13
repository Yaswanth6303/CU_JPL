package org.example.MyMavenProject.classwork.Mar01;

import java.util.HashSet;
import java.util.Set;

public class FibonacciSet {
    
    private Set<Integer> fibSet;

    public FibonacciSet() {
        this.fibSet = new HashSet<>();
    }

    public Integer getNthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        fibSet.add(0);
        fibSet.add(1);

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
    
    public Integer getNthFibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }

        int fibValue = getNthFibonacci(n - 1) + getNthFibonacci(n - 2);

        fibSet.add(fibValue);

        return fibValue;
    }
    
    public static void main(String[] args) {
        FibonacciSet fib = new FibonacciSet();
        System.out.println(fib.getNthFibonacci(1));
        System.out.println(fib.getNthFibonacciRecursion(1));
    }
}