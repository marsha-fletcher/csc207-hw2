package edu.grinnell.csc207.fletcher1.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RationalTest {

	@Test
	public void testRationalInts() {
		Rational num0 = new Rational (1, 0);
		Rational num = new Rational (3, 10);
		Rational num2 = new Rational (-3, 4);
		Rational num3 = new Rational (0, 1);
		Rational num4 = new Rational (5, 4);
		Rational num5 = new Rational (13, -8);
		//not sure what I can assert here, since the getters all have their own tests
		//and I don't know how to test that num0 throws an exception
	}//testRationalInts

	@Test
	public void testRationalDouble() {
		Rational num = new Rational (0.3);
		Rational num2 = new Rational (-0.75);
		Rational num3 = new Rational (0);
		Rational num4 = new Rational (1.25);
		Rational num5 = new Rational (-1.625);
		//see comments above
	}//testRationalDouble

	@Test
	public void testGetNumerator() {
		Rational num = new Rational (3, 10);
		Rational num2 = new Rational (-3, 4);
		Rational num3 = new Rational (0, 1);
		Rational num4 = new Rational (5, 4);
		Rational num5 = new Rational (13, -8);
		Rational num6 = new Rational (0.3);
		Rational num7 = new Rational (-0.75);
		Rational num8 = new Rational (0);
		Rational num9 = new Rational (1.25);
		Rational num10 = new Rational (-1.625);
		
		assertEquals("getNumerator: pos, num > denom, int constructor",
				3, num.getNumerator());
		assertEquals("getNumerator: neg, num > denom, int constructor", 
				-3, num2.getNumerator());
		assertEquals("getNumerator: zero, int constructor", 0, num3.getNumerator());
		assertEquals("getNumerator: pos, num < denom, int constructor", 
				5, num4.getNumerator());
		assertEquals("getNumerator: neg, num < denom, int constructor", 
				-13, num5.getNumerator());
		
		assertEquals("getNumerator: pos, num > denom, double constructor",
				3, num6.getNumerator());
		assertEquals("getNumerator: neg, num > denom, double constructor", 
				-3, num7.getNumerator());
		assertEquals("getNumerator: zero, double constructor", 0, num8.getNumerator());
		assertEquals("getNumerator: pos, num < denom, double constructor", 
				5, num9.getNumerator());
		assertEquals("getNumerator: neg, num < denom, double constructor", 
				-13, num10.getNumerator());
	}//testGetNumerator

	@Test
	public void testGetDenominator() {
		Rational num = new Rational (3, 10);
		Rational num2 = new Rational (-3, 4);
		Rational num3 = new Rational (0, 1);
		Rational num4 = new Rational (5, 4);
		Rational num5 = new Rational (13, -8);
		Rational num6 = new Rational (0.3);
		Rational num7 = new Rational (-0.75);
		Rational num8 = new Rational (0);
		Rational num9 = new Rational (1.25);
		Rational num10 = new Rational (-1.625);
		
		assertEquals("getDenominator: pos, num > denom, int constructor",
				10, num.getDenominator());
		assertEquals("getDenominator: neg, num > denom, int constructor", 
				4, num2.getDenominator());
		assertEquals("getDenominator: zero, int constructor", 1, num3.getDenominator());
		assertEquals("getDenominator: pos, num < denom, int constructor", 
				4, num4.getDenominator());
		assertEquals("getDenominator: neg, num < denom, int constructor", 
				8, num5.getDenominator());
		
		assertEquals("getDenominator: pos, num > denom, double constructor",
				10, num6.getDenominator());
		assertEquals("getDenominator: neg, num > denom, double constructor", 
				4, num7.getDenominator());
		assertEquals("getDenominator: zero, double constructor", 1, num8.getDenominator());
		assertEquals("getDenominator: pos, num < denom, double constructor", 
				4, num9.getDenominator());
		assertEquals("getDenominator: neg, num < denom, double constructor", 
				8, num10.getDenominator());
	}//testGetDenominator

	@Test
	public void testGetDecimal() {
		Rational num = new Rational (3, 10);
		Rational num2 = new Rational (-3, 4);
		Rational num3 = new Rational (0, 1);
		Rational num4 = new Rational (5, 4);
		Rational num5 = new Rational (13, -8);
		Rational num6 = new Rational (0.3);
		Rational num7 = new Rational (-0.75);
		Rational num8 = new Rational (0);
		Rational num9 = new Rational (1.25);
		Rational num10 = new Rational (-1.625);
		
		assertEquals("getDecimal: pos, num > denom, int constructor",
				0.3, num.getDecimal());
		assertEquals("getDecimal: neg, num > denom, int constructor", 
				-0.75, num2.getDecimal());
		assertEquals("getDecimal: zero, int constructor", 0, num3.getDecimal());
		assertEquals("getDecimal: pos, num < denom, int constructor", 
				1.25, num4.getDecimal());
		assertEquals("getDecimal: neg, num < denom, int constructor", 
				-1.625, num5.getDecimal());
		
		assertEquals("getDecimal: pos, num > denom, double constructor",
				0.3, num6.getNumerator());
		assertEquals("getDecimal: neg, num > denom, double constructor", 
				-0.75, num7.getDecimal());
		assertEquals("getDecimal: zero, double constructor", 0, num8.getDecimal());
		assertEquals("getDecimal: pos, num < denom, double constructor", 
				1.25, num9.getDecimal());
		assertEquals("getDecimal: neg, num < denom, double constructor", 
				-1.625, num10.getDecimal());
	}//testGetDecimal

	@Test
	public void testSetNumerator() {
		Rational num = new Rational (3, 10);
		num.setNumerator(6);
		Rational num2 = new Rational (-3, 4);
		num2.setNumerator(-5);
		Rational num3 = new Rational (13, -8);
		num3.setNumerator(4);
		Rational num4 = new Rational (0.3);
		num4.setNumerator(6);
		Rational num5 = new Rational (-0.75);
		num5.setNumerator(-5);
		Rational num6 = new Rational (0);
		num6.setNumerator(3);
		
		assertEquals("setNumerator: pos, keep pos, int based constructor",
				6, num.getNumerator());
		assertEquals("setNumerator: neg, keep neg, int based constructor",
				-5, num2.getNumerator());
		assertEquals("setNumerator: neg, change to pos, int based constructor",
				4, num3.getNumerator());
		assertEquals("setNumerator: pos, keep pos, dec based constructor",
				6, num4.getNumerator());
		assertEquals("setNumerator: neg, keep neg, dec based constructor",
				-5, num5.getNumerator());
		assertEquals("setNumerator: zero, change to non-zero, dec based constructor: check num",
				3, num6.getNumerator());
		assertEquals("setNumerator: zero, change to non-zero, dec based constructor: check denom",
				1, num6.getNumerator());
		
	}//testSetNumerator

	@Test
	public void testSetDenominator() {
		Rational num = new Rational (3, 10);
		num.setDenominator(6);
		Rational num2 = new Rational (-3, 4);
		num2.setDenominator(-5);
		Rational num3 = new Rational (13, -8);
		num3.setDenominator(4);
		Rational num4 = new Rational (0.3);
		num4.setDenominator(6);
		Rational num5 = new Rational (-0.75);
		num5.setDenominator(-5);
		
		assertEquals("setDenominator: pos, keep pos, int based constructor",
				6, num.getDenominator());
		assertEquals("setDenominator: neg, keep neg, int based constructor",
				-5, num2.getDenominator());
		assertEquals("setDenominator: neg, change to pos, int based constructor",
				4, num3.getDenominator());
		assertEquals("setDenominator: pos, keep pos, dec based constructor",
				6, num4.getDenominator());
		assertEquals("setDenominator: neg, keep neg, dec based constructor",
				-5, num5.getDenominator());
	}//testSetDenominator

	@Test
	public void testSetDecimal() {
		Rational num = new Rational (3, 10);
		num.setDecimal(0.6);
		Rational num2 = new Rational (-3, 4);
		num2.setDecimal(-0.5);
		Rational num3 = new Rational (13, -8);
		num3.setDecimal(0.4);
		Rational num4 = new Rational (0.3);
		num4.setDecimal(0.6);
		Rational num5 = new Rational (-0.75);
		num5.setDecimal(-0.5);
		
		assertEquals("setDecimal: pos, keep pos, int based constructor",
				0.6, num.getDecimal());
		assertEquals("setDecimal: neg, keep neg, int based constructor",
				-0.5, num2.getDecimal());
		assertEquals("setDecimal: neg, change to pos, int based constructor",
				0.4, num3.getDecimal());
		assertEquals("setDecimal: pos, keep pos, dec based constructor",
				0.6, num4.getDecimal());
		assertEquals("setDecimal: neg, keep neg, dec based constructor",
				-0.5, num5.getDecimal());
	}

	@Test
	public void testMakeReciprocol() {
		Rational num = new Rational (3, 4);
		Rational num2 = new Rational(-3, 4);
		Rational num3 = new Rational(0);
		Rational num4 = new Rational (1.45);
		Rational num5 = new Rational (-1.45);
		
		assertEquals("makeReciprocol: pos, int based constructor",
				num.getNumerator(), num.makeReciprocol().getDenominator());
		assertEquals("makeReciprocol: neg, int based constructor",
				(num2.getNumerator() * -1), num2.makeReciprocol().getDenominator());
		//assertException(num3.makeReciprocol()); or however that actually works
		assertEquals("makeReciprocol: pos, dec based constructor",
				num4.getNumerator(), num4.makeReciprocol().getDenominator());
		assertEquals("makeReciprocol: neg, dec based constructor",
				(num5.getNumerator() * -1), num5.makeReciprocol().getDenominator());
		
	}

	@Test
	public void testReciprocol() {
		Rational num = new Rational (3, 4);
		Rational num2 = new Rational(-3, 4);
		Rational num3 = new Rational(0);
		Rational num4 = new Rational (1.45);
		Rational num5 = new Rational (-1.45);
		
		Rational num6 = num.reciprocol();
		Rational num7 = num2.reciprocol();
		Rational num8 = num4.reciprocol();
		Rational num9 = num5.reciprocol();
		
		assertEquals("recipricol: pos, int based constructor, check num",
				num.getDenominator(), num6.getNumerator());
		assertEquals("recipricol: pos, int based constructor, check denom",
				num.getNumerator(), num6.getDenominator());
		assertEquals("recipricol: neg, int based constructor, check num",
				num2.getDenominator(), (num7.getNumerator()) * -1);
		assertEquals("recipricol: neg, int based constructor, check denom",
				(num2.getNumerator() * -1), num7.getDenominator());
		assertEquals("recipricol: pos, dec based constructor, check num",
				num4.getDenominator(), num8.getNumerator());
		assertEquals("recipricol: pos, dec based constructor, check denom",
				num4.getNumerator(), num8.getDenominator());
		assertEquals("recipricol: neg, dec based constructor, check num",
				num5.getDenominator(), (num9.getNumerator()) * -1);
		assertEquals("recipricol: neg, dec based constructor, check denom",
				(num5.getNumerator() * -1), num9.getDenominator());

		//assertException(num3.Reciprocol());
	}

	@Test
	public void testMultiplyInt() {

		Rational num = new Rational (3, 10);
		Rational num2 = new Rational (-3, 4);
		Rational num3 = new Rational (0, 1);
		Rational num4 = new Rational (4, 5);
		Rational num5 = new Rational (-8, 13);
		Rational num6 = new Rational (0.3);
		Rational num7 = new Rational (-0.75);
		Rational num8 = new Rational (0);
		Rational num9 = new Rational (0.8);
		Rational num10 = new Rational (-0.8);
		//and again so I can multiply by negatives
		Rational num11 = new Rational (3, 10);
		Rational num12 = new Rational (-3, 4);
		Rational num13 = new Rational (0, 1);
		Rational num14 = new Rational (4, 5);
		Rational num15 = new Rational (-8, 13);
		Rational num16 = new Rational (0.3);
		Rational num17 = new Rational (-0.75);
		Rational num18 = new Rational (0);
		Rational num19 = new Rational (0.8);
		Rational num20 = new Rational (-0.8);
		//I should probably test multiplying by things other than two
		//but I already have 20 rationals here
		
		assertEquals("multiply: pos * 2, denominator a multiple of 2, int based constructor",
				5, num.multiply(2).getDenominator());
		assertEquals("multiply: neg * 2, denominator a multiple of 2, int based constructor",
				2, num2.multiply(2).getDenominator());
		assertEquals("multiply: 0*2, int based constructor", 0, num3.multiply(2).getNumerator());
		assertEquals("multiply: pos * 2, denominator not a multiple of 2, int based constructor",
				8, num4.multiply(2).getNumerator());
		//this is the part where I realized that I probably could use a loop
		//and make my life easier. Unfortunately, I've been doing it manually 
		//for long enough that the realization kind of destroyed my will to be
		//productive. Hopefully you can kind of see where I was going with this.
	}

	@Test
	public void testMultiplyRational() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiple() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivideInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivideRational() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivideDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddRational() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtractInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtractRational() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtractDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testExptInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testExptRational() {
		fail("Not yet implemented");
	}

	@Test
	public void testExptDouble() {
		fail("Not yet implemented");
	}

}
