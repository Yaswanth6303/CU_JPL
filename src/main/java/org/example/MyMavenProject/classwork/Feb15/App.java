package org.example.MyMavenProject.classwork.Feb15;

public class App {
	/**
	 * The function takes 2 positive integers
	 * @param a where a > 0 
	 * @param b where b > 0
	 * @return sum if a & b > 0 else -1
	 */
	public int add(int a, int b) {
		if (a <= 0 || b <= 0) {
			return -1;
		}
		
		return a + b;
	}
	public static void main(String[] args) {
		App sumApp = new App();
		System.out.println(sumApp.add(5, 6));
	}
}

