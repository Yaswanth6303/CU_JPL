package org.example.MyMavenProject.homework.Feb22;

public class ReverseNumber {
	/**
	 * Reverses an integer.
	 * @param number Integer input to be reversed.
	 * @return Reversed integer.
	 * Time Complexity: O(n) → The number of iterations depends on the number of digits (d) in the input number.
	 * Space Complexity: O(1) → Constant space is used regardless of the input size.
	 */
	public static Integer reverseInteger(Integer number) {
		boolean isNegative = number < 0;
		if (isNegative) {
			number = -number;
		}
		
		Integer reverseNumber = 0;

		while (number > 0) {
			int lastDigit = number % 10; 
			reverseNumber = (reverseNumber * 10) + lastDigit; 
			number /= 10; 
		}
		
		return isNegative ? -reverseNumber : reverseNumber;
	}

	public static void main(String[] args) {
		System.out.println(reverseInteger(123));  
		System.out.println(reverseInteger(-456)); 
		System.out.println(reverseInteger(100));  
	}
}
