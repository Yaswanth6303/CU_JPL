package org.example.MyMavenProject.classwork.Feb15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    private App app;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("After all tests");
    }

    @BeforeEach
    void setUp() throws Exception {
        app = new App();
    }

    @AfterEach
    void tearDown() throws Exception {
        app = null;
    }

    @Test
    void testAddWithPositiveNumbers() {
        assertEquals(5, app.add(2, 3), "2 + 3 should be 5");
    }

    @Test
    void testAddWithZeroAndPositiveNumber() {
        assertEquals(-1, app.add(0, 5), "0 and positive number should return -1");
    }

    @Test
    void testAddWithNegativeAndPositiveNumber() {
        assertEquals(-1, app.add(-2, 3), "Negative number should return -1");
    }

    @Test
    void testAddWithBothNegativeNumbers() {
        assertEquals(-1, app.add(-1, -1), "Both negative numbers should return -1");
    }

    @Test
    void testAddWithLargeNumbers() {
        assertEquals(1000000, app.add(500000, 500000), "500000 + 500000 should be 1000000");
    }
}
