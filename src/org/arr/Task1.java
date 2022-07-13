package org.arr;

import java.util.Arrays;

public class Task1 {

   public static int[] getCumulativeSum (int num[][]) {
    	for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		return null;
    	
		
		
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{1,1,1,1,1},{1,3,5,7,9}};
	
		int sum[] = getCumulativeSum(arr);
		System.out.println("Cumulaitve Sum = " + Arrays.toString(sum));
	}
}
