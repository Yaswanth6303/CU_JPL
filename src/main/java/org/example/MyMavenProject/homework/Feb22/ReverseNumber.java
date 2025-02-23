package org.example.MyMavenProject.homework.Feb22;

public class ReverseNumber {
	/**
	 * Takes a integer as input
	 * @param number
	 * @return reversed number
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
	}
}
