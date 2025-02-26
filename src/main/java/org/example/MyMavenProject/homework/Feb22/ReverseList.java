package org.example.MyMavenProject.homework.Feb22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	/**
	 * Takes a integer as input
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * @param list the input list of integers
	 * @return reversed list
	 */
	public static List<Integer> reverseListMethod_1(List<Integer> list) {
		// Create a new ArrayList called reverseList, copying elements from the input list.
		List<Integer> reverseList = new ArrayList<Integer>(list);
		
		// Reverse the order of elements within the reverseList using Collections.reverse().
		Collections.reverse(reverseList);
		
		// Return the reversed list.
		return reverseList;
	}
	/**
	 * Takes a integer as input
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * @param list the input list of integers
	 * @return reversed list
	 */
	public static List<Integer> reverseListMethod_2(List<Integer> list) {
		// Create a new empty ArrayList called reverseList.
		List<Integer> reverseList = new ArrayList<Integer>();
		
		// Iterate through the input list in reverse order, starting from the last element.
		// list.size() -1 will give the index of last element
		for (int i = list.size() - 1; i >= 0; i--) {
			// Get the element at index i from the input list.
			// Add the retrieved element to the reverseList.
			reverseList.add(list.get(i));
		}
		
		// Return the manually reversed list.
		return reverseList;
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.print("Reversed List using Inbulit Method: ");
		System.out.println(reverseListMethod_1(list));
		System.out.print("Reversed List Manually: ");
		System.out.println(reverseListMethod_2(list));
	}
}

