package org.arr;

import java.util.Scanner;

public class OneDimLoop {

	public static void main(String[] args) {
		int a[] = new int [5];
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the array values");
		for (int i = 0; i< a.length;i++) {
			a[i] = n.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
