package org.arr;

import java.util.Arrays;
import java.util.Scanner;

public class SamCumScanner {

	public static int[] cumulativeSum(int [] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			num[i] = sum;
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		
		int num[] = new int[n];
		System.out.println("Enter the array value");
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		
		int sum[] = cumulativeSum(num);
		System.out.println("Cumulaitve Sum = " + Arrays.toString(sum));
		
	}
}
