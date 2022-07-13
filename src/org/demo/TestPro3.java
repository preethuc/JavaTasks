package org.demo;

import java.util.Arrays;

public class TestPro3 {

	public static void main(String[] args) {
		//Ascending Order
		int a[] = {8,10,6,22,80,70,56,21,17,18};
		int temp = 0;
		System.out.println("Before Sorting");
		for (int i = 0; i < a.length; i++) {
		     System.out.println(a[i] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		/*//Sort the array using method
		int a[] = {8,10,6,22,80,70,56,21,17,18};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
	}
}
