/**
 * 
 */
package com.sutha.hobby;

import java.util.Arrays;

/**
 * @author suthagaran
 *
 *This is a sample solution to find the GCD of an array of integers.
 */
public class FindGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] intArray = new int[]{1950, 450,50, 75, 100, 2400};
		
		System.out.println("GCD of " + Arrays.toString(intArray) + " : " + findGCD(intArray));
		System.out.println("GCD of 4, 6 : " + findGCD(4, 6));
	}
	
	public static int findGCD(int[] values){
		Arrays.sort(values);
		int min = values[0];
		int currentMin = Integer.MAX_VALUE;
		while(true){
			for (int i =0; i < values.length; i++){
				if(values[i] == min) continue;
				values[i] = values[i] % min;
				if(values[i] != 0 && values[i]<currentMin){
					currentMin = values[i];
				}
			}		
			if(currentMin == min) break;
			
			min = currentMin;
		}
		
		return min;
	}
	
	// find gcd of two numners
	
	public static int findGCD(int a, int b){
		int tmp;
		while(a%b != 0){
			tmp = b;
			b = a%b;
			a = tmp;
		}
		
		return b;
	}

}
