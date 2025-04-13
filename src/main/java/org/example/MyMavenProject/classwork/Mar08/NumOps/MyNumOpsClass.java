package org.example.MyMavenProject.classwork.Mar08.NumOps;

interface I { // SAM (Single Abstract Method)
	Integer apply(Integer i, Integer j);
}

class MyI implements I {

	@Override
	public Integer apply(Integer i, Integer j) {
		return i + j;
	}
}

public class MyNumOpsClass implements INumOps {

	public Integer sum(Integer a, Integer b) {
		return a + b;
	}

	public Integer sub(Integer a, Integer b) {
		return a - b;
	}
	
	public Integer myOp(Integer a, Integer b, boolean flag) {
		if (flag) {
			return sum(a, b);
		} else {
			return sub(a, b);
		}
	}
	
	public Integer myOp_1(Integer a, Integer b, I op) {
		return op.apply(a, b);
	}
	
	public static void main(String[] args) {
		MyNumOpsClass numOps = new MyNumOpsClass();
		Integer result = numOps.sum(10, 20);
		System.out.println("Result: " + result);
		System.out.println();
		
		Integer result_1 = numOps.myOp(5, 6, true);
		System.out.println("Result_1: " + result_1);
		System.out.println();
		
		I im = (Integer a, Integer b) -> {
			return a + b;
		};
		Integer result_2 = numOps.myOp_1(10, 20, im);
		System.out.println("Result_2: " + result_2);
		System.out.println();
		
		I im1 = (a, b) -> a + b;
		Integer result_3 = numOps.myOp_1(10, 20, im1);
		System.out.println("Result_3: " + result_3);
		System.out.println();
		
		I im2 = (a, b) -> a - b;
		Integer result_4 = numOps.myOp_1(20, 10, im2);
		System.out.println("Result_4: " + result_4);
	}
}
