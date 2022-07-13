package org.arr;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length-i; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

	}
	public static void main(String[] args) {
		int a[] = {22,10,14,13,6,17};
	    bubbleSort(a);
		System.out.println(Arrays.toString(a));
		
	}
}
