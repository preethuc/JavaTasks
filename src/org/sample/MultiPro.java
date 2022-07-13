package org.sample;

import java.util.Scanner;

public class MultiPro {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		System.out.println("Multiplication of the number " + n);
		for (int i = 1; i <=10; i++) {
			System.out.println(i + "x" + n + "=" +(n*i));
			
		}
	} 
}
