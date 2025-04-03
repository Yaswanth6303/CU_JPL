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
		// Check if the number is negative and make it positive for processing
		boolean isNegative = number < 0;
		if (isNegative) {
			number = -number;
		}
		
		Integer reverseNumber = 0;

		// Loop through each digit of the number
		while (number > 0) {
			int lastDigit = number % 10; // Extract the last digit
			reverseNumber = (reverseNumber * 10) + lastDigit; // Append digit to reversed number
			number /= 10; // Remove last digit from original number
		}
		
		// Restore the negative sign if the original number was negative
		return isNegative ? -reverseNumber : reverseNumber;
	}

	public static void main(String[] args) {
		// Test cases
		System.out.println(reverseInteger(123));  
		System.out.println(reverseInteger(-456)); 
		System.out.println(reverseInteger(100));  
	}
}
