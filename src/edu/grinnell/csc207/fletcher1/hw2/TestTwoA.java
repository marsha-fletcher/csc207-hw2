package edu.grinnell.csc207.fletcher1.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {

	@Test
	public void testIsMultiple() {
		assertEquals("testIsMultiple: Both zero", true, TwoA.isMultiple(0, 0));
		assertEquals("testIsMultiple: Both positive primes", false, TwoA.isMultiple(5, 7));
		assertEquals("testIsMultiple: One positive prime, one negative prime", false, TwoA.isMultiple(-5, 7));
		assertEquals("testIsMultiple: Both negative primes", false, TwoA.isMultiple(-5, -7));
		assertEquals("testIsMultiple: One prime, one nonprime", false, TwoA.isMultiple(13, 4));
		assertEquals("testIsMultiple: a is a multiple of b, evens", true, TwoA.isMultiple(12, 4));
		assertEquals("testIsMultiple: b is a multiple of a", false, TwoA.isMultiple(4, 12));
		assertEquals("testIsMultiple: a is a multiple of b, a negative", true, TwoA.isMultiple(-12, 4));
		assertEquals("testIsMultiple: a is a multiple of b, b negative", true, TwoA.isMultiple(12, -4));
		assertEquals("testIsMultiple: a is a multiple of b, both negative", true, TwoA.isMultiple(-12, -4));
		assertEquals("testIsMultiple: a zero", true, TwoA.isMultiple(0, -4));
		assertEquals("testIsMultiple: b zero", false, TwoA.isMultiple(-12, 0));
	}//testIsMultiple

	@Test
	public void testIsOdd() {
		assertEquals("testIsOdd: Positive Odd", true, TwoA.isOdd(333));
		assertEquals("testIsOdd: Negative Odd", true, TwoA.isOdd(-15));
		assertEquals("testIsOdd: Positive Even", false, TwoA.isOdd(14));
		assertEquals("testIsOdd: Negative Even", false, TwoA.isOdd(-2));
		assertEquals("testIsOdd: zero", false, TwoA.isOdd(0));
	}//testIsOdd

	@Test
	public void testOddSumTo() {
		assertEquals("testOddSumTo: Small odd number", 4, TwoA.oddSumTo(5));
		assertEquals("testOddSumTo: Largish odd number", 49, TwoA.oddSumTo(15));
		assertEquals("testOddSumTo: zero", 0, TwoA.oddSumTo(0));
		assertEquals("testOddSumTo: Negative odd number", 0, TwoA.oddSumTo(-1463));
		assertEquals("testOddSumTo: Negative positive number", 0, TwoA.oddSumTo(-1400));
		assertEquals("testOddSumTo: Small even number", 9, TwoA.oddSumTo(6));
		assertEquals("testOddSumTo: Largish even number", 49, TwoA.oddSumTo(14));
	}//testOddSumTo

	@Test
	public void testAllDistinct() {
		int[] empty = new int[0];
		int[] vals1 = {1, 3, 56, 24, 1};
		int[] vals2 = {1, 3, 4, 6, 8, 9, 10, 7, 5, 2};
		int[] vals3 = {1, 1, 1, 1, 1, 1};
		int[] vals4 = {-1, -3, -4, -6, -8, -9, -10, -7, -5, -2};
		int[] vals5 = {-1, -3, -4, -6, -8, 1, 3, 4, 6, 8};
		int[] vals6 = {5, 23, 6, 1, 8, 23, 24, 86};
		assertEquals("testAllDistinct: empty array", true, TwoA.allDistinct(empty));
		assertEquals("testAllDistinct: First and last same", false, TwoA.allDistinct(vals1));
		assertEquals("testAllDistinct: All positive and distinct", true, TwoA.allDistinct(vals2));
		assertEquals("testAllDistinct: All same", false, TwoA.allDistinct(vals3));
		assertEquals("testAllDistinct: All negative and distinct", true, TwoA.allDistinct(vals4));
		assertEquals("testAllDistinct: mixed negative and positive, all distinct", true, TwoA.allDistinct(vals5));
		assertEquals("testAllDistinct: Duplicates not first or last", false, TwoA.allDistinct(vals6));
	}//testAllDistinct

	@Test
	public void testReverseInts() {
		int[] empty = new int[0];
		int[] vals1 = {1, 3, 56, 24, 2};
		int[] vals2 = {1, 3, 4, 6, 8, 9, 10, 7, 5, 2};
		int[] vals3 = {1, 1, 1};
		int[] vals4 = {1, 3, 5, 5, 3, 1};
		// Sorry that this section got so long. Array.equals seemed to be
		// checking that the arrays were in the same location in memory, not
		// that the elements in each array were the same, so I did it manually


		assertEquals("testReverseInts: empty array", empty, TwoA.reverseInts(empty));
		TwoA.reverseInts(vals1);
		assertEquals("testReverseInts: odd length index 0", 2, vals1[0]);
		assertEquals("testReverseInts: odd length index 1", 24, vals1[1]);
		assertEquals("testReverseInts: odd length index 2", 56, vals1[2]);
		assertEquals("testReverseInts: odd length index 3", 3, vals1[3]);
		assertEquals("testReverseInts: odd length index 4", 1, vals1[4]);
		TwoA.reverseInts(vals2);
		assertEquals("testReverseInts: even length index 0", 2, vals2[0]);
		assertEquals("testReverseInts: even length index 1", 5, vals2[1]);
		assertEquals("testReverseInts: even length index 2", 7, vals2[2]);
		assertEquals("testReverseInts: even length index 3", 10, vals2[3]);
		assertEquals("testReverseInts: even length index 4", 9, vals2[4]);
		assertEquals("testReverseInts: even length index 5", 8, vals2[5]);
		assertEquals("testReverseInts: even length index 6", 6, vals2[6]);
		assertEquals("testReverseInts: even length index 7", 4, vals2[7]);
		assertEquals("testReverseInts: even length index 8", 3, vals2[8]);
		assertEquals("testReverseInts: even length index 9", 1, vals2[9]);
		TwoA.reverseInts(vals3);
		assertEquals("testReverseInts: all same index 0", 1, vals3[0]);
		assertEquals("testReverseInts: all same index 1", 1, vals3[1]);
		assertEquals("testReverseInts: all same index 2", 1, vals3[2]);
		TwoA.reverseInts(vals4);
		assertEquals("testReverseInts: Palindrome index 0", 1, vals4[0]);
		assertEquals("testReverseInts: Palindrome index 1", 3, vals4[1]);
		assertEquals("testReverseInts: Palindrome index 2", 5, vals4[2]);
		assertEquals("testReverseInts: Palindrome index 3", 5, vals4[3]);
		assertEquals("testReverseInts: Palindrome index 4", 3, vals4[4]);
		assertEquals("testReverseInts: Palindrome index 5", 1, vals4[5]);
	}//testReverseInts

}//TestTwoA
