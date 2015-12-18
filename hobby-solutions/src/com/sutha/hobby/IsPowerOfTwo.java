/**
 * 
 */
package com.sutha.hobby;

/**
 * @author suthagaran
 *
 *Find whether a given integer is power of two.
 */
public class IsPowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("16384 is power of 2 :" + isPowerOfTwo(16384));
	}

	public static boolean isPowerOfTwo(int value){
		return (value & (value-1)) == 0;
	}
}
