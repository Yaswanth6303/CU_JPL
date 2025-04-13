package org.example.MyMavenProject.classwork.Mar01;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMap {
	
	public Map<Integer, Integer> generateFibonacci(int n) {
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
    
    private Map<Integer, Integer> fibMap;
    
    public FibonacciMap() {
    	this.fibMap = new HashMap<>();
    }
		
    public Integer getNthFibonacci(int n) {
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



