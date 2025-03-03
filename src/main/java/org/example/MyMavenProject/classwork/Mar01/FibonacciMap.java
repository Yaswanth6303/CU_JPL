package org.example.MyMavenProject.classwork.Mar01;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMap {
	
	private Map<Integer, Integer> fibonacciMap;
	
	public FibonacciMap() {
		this.fibonacciMap = new HashMap<>();
	}
	
	public Integer getNthFibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		
		if (fibonacciMap.containsKey(n)) {
			return fibonacciMap.get(n);
		}
		
		int fibValue = getNthFibonacci(n - 1) + getNthFibonacci(n - 2);
		fibonacciMap.put(n, fibValue);
		
		return fibValue;
	}
	
	public Map<Integer, Integer> generateFibonacci(int n) {
        
        int a = 0;
        int b = 1;
        
        for (int i = 0; i < n; i++) {
        	fibonacciMap.put(i, a); 
            int next = a + b;
            a = b;
            b = next;
        }
        return fibonacciMap;
    }
	
	public static void main(String[] args) {
		FibonacciMap getNthFib = new FibonacciMap();
        System.out.println(getNthFib.getNthFibonacci(5));
        System.out.println();
        
        FibonacciMap generateSeries = new FibonacciMap();
        int n = 10;
        Map<Integer, Integer> fibonacciSeries = generateSeries.generateFibonacci(n);
        System.out.println("Fibonacci Series:");
        for (Map.Entry<Integer, Integer> entry : fibonacciSeries.entrySet()) {
            System.out.println("Index " + entry.getKey() + " -> " + entry.getValue());
        }
	}
}
