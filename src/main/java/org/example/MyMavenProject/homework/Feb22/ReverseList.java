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
		List<Integer> reverseList = new ArrayList<Integer>(list);
		
		Collections.reverse(reverseList);
		
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
		List<Integer> reverseList = new ArrayList<Integer>();
		
		for (int i = list.size() - 1; i >= 0; i--) {
			reverseList.add(list.get(i));
		}
		
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

