package org.sample;

import java.util.Scanner;

public class PoweBase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int base,power;
		int result = 1;
		
		System.out.println("Enter Base value");
		base = input.nextInt();
		
		System.out.println("Enter power value");
		power = input.nextInt();
		
		for (int i = 1; i <= power; i++) {
			result *= base;
			System.out.println(result);
		}
		System.out.println("Result" + result);
	}
}
