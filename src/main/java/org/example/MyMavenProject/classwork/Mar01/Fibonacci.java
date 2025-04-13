package org.example.MyMavenProject.classwork.Mar01;

public class Fibonacci {
    public static Integer getNthFib(int n) {
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
    
    public static Integer getNthFibRecursion(int n) {
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
