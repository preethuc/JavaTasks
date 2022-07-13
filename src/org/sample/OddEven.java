package org.sample;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a = s.nextInt();
		 if( a % 2 == 0) {
			System.out.println("even number");
		}
		 else {
			System.out.println("odd");
		}	
	
	}
}
