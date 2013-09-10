package edu.grinnell.csc207.fletcher1.hw2;

public class TwoB {
    /**
     * Compute the average of two integers.  Rounds toward zero if the
     * average is not a whole number.
     * Returns -1 if left or right equal MAX_VALUE
     */
    public static int average(int left, int right) {
    	//bug: Does not check that left+right goes above MAX_VALUE
    	if (left == Integer.MAX_VALUE 
    			|| right == Integer.MAX_VALUE 
    			|| (left + right) > Integer.MAX_VALUE){
    		return -1;
    		// This isn't the best solution, but it addresses the bug
    	}//if > maxvalue
        return (left + right) / 2;
    } // average(int,int)
    
    
} // class TwoB