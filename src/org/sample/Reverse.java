package org.sample;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		
		int num;
		int rev = 0;
		System.out.println("enter the number");
		num = r.nextInt();
		int temp = num;
		int rem = 0;
		while (temp>0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
			
			System.out.println(rev);
		}
		System.out.println("Reverse of " + num + " is " + rev);
	}
}
