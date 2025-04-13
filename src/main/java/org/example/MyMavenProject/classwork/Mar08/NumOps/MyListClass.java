package org.example.MyMavenProject.classwork.Mar08.NumOps;

import java.util.function.Predicate;

public class MyListClass {
	public static void main(String[] args) {
		
		IListOps<Integer> ib = (i) -> i > 0; 
		System.out.println(ib.test(5));
		
		Predicate<Integer> ibPredicate = (i) -> i > 0; 
		System.out.println(ibPredicate.test(4));
	}
}
