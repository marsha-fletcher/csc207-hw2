package edu.grinnell.csc207.fletcher1.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoB {

	@Test
	public void testAverage() {
		assertEquals("average is a whole number", 4, TwoB.average(3, 5));
		assertEquals("average is not a whole number", 7, TwoB.average(3, 12));
		assertEquals("average is a whole number, ints are negative", -2, TwoB.average(-2, -2));
		assertEquals("average is not a whole number, ints are negative", -14, TwoB.average(-4, -25));
		assertEquals("average is a whole number, left is negative", 1, TwoB.average(-2, 4));
		assertEquals("average rounds to zero, left negative", 0, TwoB.average(4, -5));
		assertEquals("average rounds to zero, right negative", 0, TwoB.average(-4, 5));
		assertEquals("average is 0", 0, TwoB.average(-4, 4));
		assertEquals("Everything is 0", 0, TwoB.average(0, 0));
	}

}
