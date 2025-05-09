package org.example.MyMavenProject.classwork.Mar01;

public class Fibonacci {

    /**
     * Calculates the n-th Fibonacci number using an iterative approach.
     * 
     * @param n the index of the Fibonacci number to retrieve (0-based)
     * @return the n-th Fibonacci number
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static Integer getNthFib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");

        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0; 
        int b = 1;
        for (int i = 2; i <= n; i++) { 
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        return b;
    }

    /**
     * Recursively calculates the n-th Fibonacci number.
     * 
     * <p>This method prints a log statement for each calculation step
     * to demonstrate the recursive call structure.</p>
     * 
     * @param n the index of the Fibonacci number to retrieve (0-based)
     * @return the n-th Fibonacci number
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static Integer getNthFibRecursion(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        System.out.println("Calculating: " + n);

        if (n == 0 || n == 1) {
            return n;
        }
        
        return getNthFibRecursion(n - 1) + getNthFibRecursion(n - 2);
    }


    public static void main(String[] args) {
        System.out.println(getNthFib(5));           
        System.out.println(getNthFibRecursion(5));
    }
}
