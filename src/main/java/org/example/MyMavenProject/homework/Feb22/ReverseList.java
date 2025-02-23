package org.example.MyMavenProject.homework.Feb22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	/**
	 * Takes a integer as input
	 * @param list
	 * @return reversed list
	 */
	public static List<Integer> reverseList(List<Integer> list) {
		List<Integer> reverseList = new ArrayList<Integer>(list);
		
		Collections.reverse(reverseList);
		
		return reverseList;
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(reverseList(list));
	}
}
