package edu.grinnell.csc207.fletcher1.hw2;

public class Rational {
	protected int numerator;
	protected int denominator;
	
	//This is here to let people use doubles in operations
	protected double decimal; 
	
	/**
	 * Constructors for a new TwoC Rational number
	 * 
	 */
	public Rational(int num, int denom){
		numerator = num;
		denominator = denom;
		//if denom is 0 and num is 0, change denom to 1
		//if denom is 0 and num is not 0, throw exception
		decimal = (num * 1.0)/denom;
		//if denom is negative, take the absolute value 
		//and make the numerator negative
	}//constructor (numerator and denominator)
	
	public Rational(double dec){
		decimal = dec;
		//something to set the numerator and denominator
		//disclaimer about how decimal might not be EXACTLY equal to 
		//numerator/denominator
		//hopefully there's a way to figure out that .1413 = 1413/10000
		//negative decimals set the numerator to negative
	}//constructor (decimal)
	/**
	 * getNumerator (Observer)
	 * Returns the numerator
	 */
	
	public int getNumerator(){
		return numerator;
	}//getNumerator
	
	/**
	 * getDenominator (Observer)
	 * Returns the denominator
	 */
	public int getDenominator(){
		return denominator;
	}//getDenominator
	
	/**
	 * getDecimal (Observer)
	 * Returns the decimal representation of the Rational
	 */
	public double getDecimal(){
		return decimal;
	}//getDecimal
	
	/**
	 * setNumerator (mutator)
	 * Changes the numerator to the given int and updates decimal
	 */
	public void setNumerator(int newNum){
		numerator = newNum;
		//Update decimal
	}//setNumerator
	
	/**
	 * setDenominator (mutator)
	 * Changes the denominator to the given int and updates decimal
	 */
	public void setDenominator(int newDenom){
		denominator = newDenom;
		//update decimal
	}//setDenominator
	
	/**
	 * setDecimal (mutator)
	 * Changes the decimal representation to the given double 
	 * and figures out an appropriate numerator and denominator 
	 */
	public void setDecimal(double dec){
		decimal = dec;
		//update numerator and denominator
	}
	
	/**
	 * makeReciprocol
	 * Switches the numerator and denominator of the Rational and returns it 
	 * (mutator, observer)
	 */
	public Rational makeReciprocol(){
		return null;
	}	
	/**
	 * reciprocal
	 * Creates a new Rational that is the reciprocal of the original (constructor)
	 */
	public Rational reciprocol(){
		return null;
	}
	
	
	/**
	 * multiply
	 * multiplies the Rational by the given multiplicand and returns it (mutator, observer)
	 */
	public Rational multiply(int multiplicand){
		numerator = numerator * multiplicand;
		return null;
		//update decimal, etc.
	}
	public Rational multiply(Rational multiplicand){
		//Do arithmetic
		return null;
	}
	public Rational multiple(double multiplicand){
		decimal = decimal * multiplicand;
		//update numerator and denominator somehow
		return null;
	}
	
	/**
	 * divide
	 * divides the Rational by the given dividend and returns it (mutator, observer)
	 */
	public Rational divide(int dividend){
		//arithmetic
		return null;
	}
	public Rational divide(Rational dividend){
		//arithmetic
		return null;
	}
	public Rational divide(double dividend){
		//arithmetic
		return null;
	}
	
	/**
	 * add
	 * adds the given number to the Rational and returns it (mutator, observer)
	 */
	public Rational add(int num){
		//arithmetic
		return null;
	}
	public Rational add(Rational num){
		//arithmetic
		return null;
	}
	public Rational add(double num){
		//arithmetic
		return null;
	}
	/**
	 * subtract
	 * subtracts the given number from the Rational (mutator, observer)
	 */
	public Rational subtract(int num){
		//arithmetic
		return null;
	}
	public Rational subtract(Rational num){
		//arithmetic
		return null;
	}
	public Rational subtract(double num){
		//arithmetic
		return null;
	}
	/**
	 * expt
	 * raises the Rational to the given power and returns it (mutator, observer)
	 */
	public Rational expt(int power){
		//arithmetic
		return null;
	}
	public Rational expt(Rational power){
		//arithmetic
		return null;
	}
	public Rational expt(double power){
		//arithmetic
		return null;
	}
}//Rational
