package org.example.MyMavenProject.homework.Feb22;

import static org.junit.jupiter.api.Assertions.*;

import org.example.MyMavenProject.homework.Feb22.ReverseNumber;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseNumberTest {

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
    void testReverseInteger_PositiveNumber() {
        assertEquals(321, ReverseNumber.reverseInteger(123), "Reversing 123 should return 321");
    }

    @Test
    void testReverseInteger_SingleDigit() {
        assertEquals(7, ReverseNumber.reverseInteger(7), "Reversing 7 should return 7");
    }

    @Test
    void testReverseInteger_NumberEndingWithZero() {
        assertEquals(54321, ReverseNumber.reverseInteger(12345), "Reversing 12345 should return 54321");
    }

    @Test
    void testReverseInteger_Zero() {
        assertEquals(0, ReverseNumber.reverseInteger(0), "Reversing 0 should return 0");
    }

    @Test
    void testReverseInteger_LargeNumber() {
        assertEquals(987654321, ReverseNumber.reverseInteger(123456789), "Reversing 123456789 should return 987654321");
    }

    @Test
    void testReverseInteger_NegativeNumber() {
        assertEquals(-321, ReverseNumber.reverseInteger(-123), "Reversing -123 should return -321");
    }
}
