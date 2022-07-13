package org.arr;

import java.util.Arrays;

public class Sort {
	public static void selectionSort(int a[]) {
      for (int i = 0; i < a.length; i++) {
		int minIndex = i;
		for (int j = i+1; j < a.length; j++) {
			if (a[j]<a[minIndex]) {
				minIndex=j;
			}
		}
		int temp = a[i];
		a[i] = a[minIndex];
		a[minIndex] = temp;
	}
}	
	public static void main(String[] args) {
		int a[] = {10,5,26,3,15,22};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
