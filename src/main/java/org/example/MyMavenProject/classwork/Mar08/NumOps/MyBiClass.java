package org.example.MyMavenProject.classwork.Mar08.NumOps;

import java.util.function.BiFunction;

class CAnand<T, U, R> implements BiOps<T, U, R> {
	
	@SuppressWarnings("unchecked")
	public R anand(T t, U u) {
        if (t instanceof Integer && u instanceof Integer) {
            return (R) Boolean.valueOf(((Integer) t) > ((Integer) u));
        }
        return null;
    }
}

public class MyBiClass {
	public static void main(String[] args) {
        CAnand<Integer, Integer, Boolean> cAnand = new CAnand<>();

        Boolean result1 = cAnand.anand(10, 5);
        Boolean result2 = cAnand.anand(3, 7);

        System.out.println("Result 1 (10 > 5): " + result1); 
        System.out.println("Result 2 (3 > 7): " + result2);  

        BiOps<Integer, Integer, Boolean> iBiOps = (x, y) -> x > y;

        System.out.println("Lambda Result 1 (10 > 5): " + iBiOps.anand(10, 5)); 
        System.out.println("Lambda Result 2 (3 > 7): " + iBiOps.anand(3, 7)); 
        System.out.println();
        
        BiFunction<Integer, Integer, Boolean> iBiFunction = (x, y) -> x > y;
        System.out.println("Lambda Result 1 (10 > 5), BiFunction: " + iBiFunction.apply(10, 5)); 
        System.out.println("Lambda Result 2 (3 > 7), BiFunction: " + iBiFunction.apply(3, 7)); 
    }
}
