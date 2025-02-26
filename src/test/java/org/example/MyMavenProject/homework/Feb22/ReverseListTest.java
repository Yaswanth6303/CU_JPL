package org.example.MyMavenProject.homework.Feb22;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseListTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Setup before all test cases");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("Cleanup after all test cases");
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Setup before each test case");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("Cleanup after each test case");
    }

    @Test
    void testReverseList_NormalCase() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expected, ReverseList.reverseListMethod_1(input), "Reversing [1, 2, 3, 4, 5] should return [5, 4, 3, 2, 1]");
        assertEquals(expected, ReverseList.reverseListMethod_2(input), "Reversing [1, 2, 3, 4, 5] should return [5, 4, 3, 2, 1]");
    }

    @Test
    void testReverseList_EmptyList() {
        List<Integer> input = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, ReverseList.reverseListMethod_1(input), "Reversing an empty list should return an empty list");
        assertEquals(expected, ReverseList.reverseListMethod_2(input), "Reversing an empty list should return an empty list");
    }

    @Test
    void testReverseList_SingleElement() {
        List<Integer> input = Arrays.asList(42);
        List<Integer> expected = Arrays.asList(42);
        assertEquals(expected, ReverseList.reverseListMethod_1(input), "Reversing a single-element list should return the same list");
        assertEquals(expected, ReverseList.reverseListMethod_2(input), "Reversing a single-element list should return the same list");
    }

    @Test
    void testReverseList_Duplicates() {
        List<Integer> input = Arrays.asList(3, 3, 2, 1, 1);
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 3);
        assertEquals(expected, ReverseList.reverseListMethod_1(input), "Reversing [3, 3, 2, 1, 1] should return [1, 1, 2, 3, 3]");
        assertEquals(expected, ReverseList.reverseListMethod_2(input), "Reversing [3, 3, 2, 1, 1] should return [1, 1, 2, 3, 3]");
    }

    @Test
    void testReverseList_NegativeNumbers() {
        List<Integer> input = Arrays.asList(-1, -2, -3, -4, -5);
        List<Integer> expected = Arrays.asList(-5, -4, -3, -2, -1);
        assertEquals(expected, ReverseList.reverseListMethod_1(input), "Reversing [-1, -2, -3, -4, -5] should return [-5, -4, -3, -2, -1]");
        assertEquals(expected, ReverseList.reverseListMethod_2(input), "Reversing [-1, -2, -3, -4, -5] should return [-5, -4, -3, -2, -1]");    }

    @Test
    void testReverseList_MixedNumbers() {
        List<Integer> input = Arrays.asList(-10, 0, 10, -20, 20);
        List<Integer> expected = Arrays.asList(20, -20, 10, 0, -10);
        assertEquals(expected, ReverseList.reverseListMethod_1(input), "Reversing [-10, 0, 10, -20, 20] should return [20, -20, 10, 0, -10]");
        assertEquals(expected, ReverseList.reverseListMethod_2(input), "Reversing [-10, 0, 10, -20, 20] should return [20, -20, 10, 0, -10]");
    }
}
