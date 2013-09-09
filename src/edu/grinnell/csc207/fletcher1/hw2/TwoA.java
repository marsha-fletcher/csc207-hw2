package edu.grinnell.csc207.fletcher1.hw2;

public class TwoA {
	/**
	 * isMultiple
	 * @param a, a long
	 * @param b, a long
	 * @return multiple?, a boolean which is true when there exists an integer
	 *                     i so that a == b*i
	 * @author Marsha Fletcher
	 */
	public static boolean isMultiple(long a, long b){
		if (a == b){
			return true;
		}//if a and b are the same, true by identity (even with zeros) 
		else if (b == 0){
			return false;
		}//if b = 0, it cannot be a factor and we don't want to divide by it
		else {
			return (((a / b) * b) == a);
		}//else
	}//isMultiple(long, long)
	
	/**
	 * isOdd
	 * @param i, an int
	 * @return odd?, a boolean that is true when i is odd
	 * @author Marsha Fletcher
	 */
	public static boolean isOdd(int i){
		i = Math.abs(i);
		for(; i >= 0; i-=2){
			if (i == 0){
				return false;
			}//if i = 0, return false
			//else, carry on
		}//for
		return true; //if i < 0 and never equaled 0, it must be odd

	}//isOdd(int)
	
	/**
	 * oddSumTo
	 * @param i, an int
	 * @return sum, an integer that is the sum of all positive odd integers 
	 *          less than i
	 * @author Marsha Fletcher
	 */
	public static int oddSumTo(int i){
		int sum = 0;
		for(int j = 1; j < i; j +=2){
			sum+=j;
		}
		return sum;
	}//oddSumTo(int)
	
	/**
	 * allDistinct
	 * @param nums, an array of ints
	 * @return distinct?, a boolean which is true if none of the elements
	 * 					   in nums is the same as any other element
	 * @author Marsha Fletcher
	 */	
	public static boolean allDistinct(int[] nums){
		//initialized here to cut down on calculations in the loop
		int len = nums.length;
		int shortLen = len - 1;
		for(int i = 0; i < shortLen; i++){
			for(int j = i + 1; j < len; j++){
				if (nums[i] == nums[j]){
					return false;
				}//if i has a duplicate, return false
				//else, carry on
			}//for j < len
		}//for i < shortLen
		return true;
	}//allDistinct(int[])
	
	/**
	 * reverseInts
	 * @param nums, an array of ints
	 * @return nums, the same array with the elements reversed
	 * @author Marsha Fletcher
	 */
	public static int[] reverseInts(int[] nums){
		int len = nums.length;
		
		if (len <= 1){
			return nums;
		}//if one or zero elements, nothing to swap
		else{ //commence swapping
			int temp;
			int switchIndex;
			int midpt = len / 2;

			for(int i = 0; i < midpt; i ++){
				switchIndex = len - (i + 1);
				if (i != switchIndex){
					temp = nums[i];
					nums[i] = nums[switchIndex];
					nums[switchIndex] = temp;
				} //if (i != switchIndex)
				//else, i = switchIndex and swapping would accomplish nothing
			}//for
			return nums;
		}//else len >= 1
	}//reverseInts(int[])
}
