package org.example.MyMavenProject.classwork.Mar01;

import java.util.HashSet;
import java.util.Set;

public class FibonacciSet {
	
	private Set<Integer> fibonacciSet;
	
	public FibonacciSet() {
		this.fibonacciSet = new HashSet<>();
	}
	
	public Integer getNthFibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		
		int fibValue = getNthFibonacci(n - 1) + getNthFibonacci(n - 2);
		fibonacciSet.add(fibValue);
		
		return fibValue;
	}
	
	public static void main(String[] args) {
		FibonacciSet fibonacciSet = new FibonacciSet();
		System.out.println(fibonacciSet.getNthFibonacci(5));
	}
}
