package org.sample;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		int fact=1;
		System.out.println("Enter the number");
		int num = f.nextInt();
		for (int i = 1; i <= num; i++) {
			fact *= i;
			System.out.println(fact);
		}
		System.out.println("Factorial " + fact);
	}
}
