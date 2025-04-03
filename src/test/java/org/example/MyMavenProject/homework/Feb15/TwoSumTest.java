package org.example.MyMavenProject.homework.Feb15;

import static org.junit.jupiter.api.Assertions.*;

import org.example.MyMavenProject.homework.Feb15.TwoSum;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll: Runs once before all test cases.");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll: Runs once after all test cases.");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach: Runs before each test case.");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach: Runs after each test case.");
	}

	@Test
	void testValidPair() {
		System.out.println("Running a valid pair");
		int[] nums = {1, 3, 5, -7, 6, -3};
		int target = 0;
		int[] resultBrute = TwoSum.twoSumBrute(nums, target);
		assertNotNull(resultBrute, "Result should not be null");
		assertEquals(1, resultBrute[0]);
		assertEquals(5, resultBrute[1]);
		int[] resultBetter = TwoSum.twoSumBrute(nums, target);
		assertNotNull(resultBetter, "Result should not be null");
		assertEquals(1, resultBetter[0]);
		assertEquals(5, resultBetter[1]);
		int[] resultOptimal = TwoSum.twoSumOptimal(nums, target);
		assertNotNull(resultOptimal, "Result should not be null");
		assertEquals(5, resultOptimal[0]);
		assertEquals(1, resultOptimal[1]);
	}
	
	@Test
	void testNoPairFound() {
        System.out.println("Running testNoPairFound...");
        int[] nums = {1, 3, 5, 7, 9};
        int target = 20;
        int[] resultBrute = TwoSum.twoSumBrute(nums, target);
        assertArrayEquals(new int[] {-1, -1}, resultBrute, "Should return [-1, -1] if no pair is found");
        int[] resultBetter = TwoSum.twoSumBrute(nums, target);
        assertArrayEquals(new int[] {-1, -1}, resultBetter, "Should return [-1, -1] if no pair is found");
        int[] resultOptimal = TwoSum.twoSumOptimal(nums, target);
        assertArrayEquals(new int[] {-1, -1}, resultOptimal, "Should return [-1, -1] if no pair is found");
    }
	
	@Test
	void testSingleElementArray() {
        System.out.println("Running testSingleElementArray...");
        int[] nums = {10};
        int target = 10;
        int[] resultBrute = TwoSum.twoSumBrute(nums, target);
        assertArrayEquals(new int[] {-1, -1}, resultBrute, "Should return [-1, -1] for a single-element array");
        int[] resultBetter = TwoSum.twoSumBetter(nums, target);
        assertArrayEquals(new int[] {-1, -1}, resultBetter, "Should return [-1, -1] for a single-element array");
        int[] resultOptimal = TwoSum.twoSumOptimal(nums, target);
        assertArrayEquals(new int[] {-1, -1}, resultOptimal, "Should return [-1, -1] for a single-element array");
    }
	
	@Test
    void testEmptyArray() {
        System.out.println("Running testEmptyArray...");
        int[] nums = {};
        int target = 5;
        int[] resultBrute = TwoSum.twoSumBrute(nums, target);
        assertArrayEquals(new int[] {-1, -1}, resultBrute, "Should return [-1, -1] for an empty array");
        int[] resultBetter = TwoSum.twoSumBetter(nums, target);
        assertArrayEquals(new int[] {-1, -1}, resultBetter, "Should return [-1, -1] for an empty array");
        int[] resultOptimal = TwoSum.twoSumOptimal(nums, target);
        assertArrayEquals(new int[] {-1, -1}, resultOptimal, "Should return [-1, -1] for an empty array");
    }

    @Test
    void testMultiplePairs() {
        System.out.println("Running testMultiplePairs...");
        int[] nums = {2, 4, 3, 3, 5};
        int target = 6;
        int[] resultBrute = TwoSum.twoSumBrute(nums, target);
        assertNotNull(resultBrute, "Result should not be null");
        assertEquals(0, resultBrute[0]);  
        assertEquals(1, resultBrute[1]);
        int[] resultBetter = TwoSum.twoSumBetter(nums, target);
        assertNotNull(resultBetter, "Result should not be null");
        assertEquals(0, resultBetter[0]);  
        assertEquals(1, resultBetter[1]);
        int[] resultOptimal = TwoSum.twoSumOptimal(nums, target);
        assertNotNull(resultOptimal, "Result should not be null");
        assertEquals(0, resultOptimal[0]);  
        assertEquals(1, resultOptimal[1]);
    }
}
