/**
 * 
 */
package com.sutha.hobby;

import java.util.Arrays;

/**
 * @author suthagaran
 *
 */
public class FindGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[]{1950, 450,50, 75, 100, 2400};
		
		System.out.println("GCD of " + intArray + " : " + findGCD(intArray));
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

}
