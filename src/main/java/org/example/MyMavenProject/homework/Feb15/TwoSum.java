package org.example.MyMavenProject.homework.Feb15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/**
	 * Function to print an array of integers
	 * It iterates through the array and prints each element within square brackets
	 * @param nums
	 */
	public static void printArray(int[] nums) {
		System.out.print("[ ");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.print("]");
		System.out.println(); 
	}
	
	/**
	 * Function to find two numbers in an array that add up to a target value using a brute-force approach
	 * It uses nested loops to check every possible pair of numbers
	 * Time Complexity : O(n^2)
	 * Space Complexity : O(1)
	 * @param nums
	 * @param target
	 * @return the index of the target
	 */
	public static int[] twoSumBrute(int[] nums, int target) {
		int n = nums.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		
		return new int[] {-1, -1};
	}
	
	/**
	 * Function to find two numbers in an array that add up to a target value using a hash map (better approach)
	 * It uses a hash map to store numbers and their indices, reducing time complexity
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * @param nums
	 * @param target
	 * @return the index of the target
	 */
	public static int[] twoSumBetter(int[] nums, int target) {
		int n = nums.length;
		
		Map<Integer, Integer> mppMap = new HashMap<>(); 
		
		for (int i = 0; i < n; i++) {
			int num = nums[i];
			int moreNeeded = target - num;
			
			// Check if the 'moreNeeded' number is already in the hash map
			// if it is, return the index of the two numbers
			// if it's not store the number and the index
			
			if (mppMap.containsKey(moreNeeded)) {
				return new int[] {mppMap.get(moreNeeded), i};
			}
			mppMap.put(num, i);
		}
		
		return new int[] {-1, -1};
	}
	
	/**
	 * Function to find two numbers in an array that add up to a target value using sorting and two pointers (optimal approach)
	 * It sorts a copy of the array and uses two pointers to find the pair, it's more efficient but uses sorting
	 * Time Complexity : O(nlogn)
	 * Space Complexity : O(n)
	 * @param nums
	 * @param target
	 * @return the index of the target
	 */
	public static int[] twoSumOptimal(int[] nums, int target) {
		int n = nums.length;
		
		int[][] indexedNums = new int[n][2];
		
		for (int i = 0; i < indexedNums.length; i++) {
			indexedNums[i][0] = i;
			indexedNums[i][1] = nums[i];
		}
		
		// Sort the 2D array based on the values in ascending order
		Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[1], b[1]));
		
		int firstIndex = 0;
		int lastIndex = n - 1;
		
		while (firstIndex < lastIndex) {
			int sum = indexedNums[firstIndex][1] + indexedNums[lastIndex][1];
			
			if (sum < target) {
				firstIndex++;
			} else if (sum > target) {
				lastIndex--;
			} else {
				return new int[] {indexedNums[firstIndex][0], indexedNums[lastIndex][0]};
			}
		}
		
		return new int[] {-1, -1};
	}
	public static void main(String[] args) {
		int[] nums = {2, 4, 3, 3, 5};
		int target = 6;
		int[] twoSumBrute = twoSumBrute(nums, target);
		int[] twoSumBetter = twoSumBetter(nums, target);
		int[] twoSumOptimal = twoSumOptimal(nums, target);
		System.out.print("Two Sum Brute: ");
		printArray(twoSumBrute);
		System.out.print("Two Sum Better: ");
		printArray(twoSumBetter);
		System.out.print("Two Sum Optimal: ");
		printArray(twoSumOptimal);
	}
}
