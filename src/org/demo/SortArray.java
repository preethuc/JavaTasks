package org.demo;

import java.util.Arrays;

public class SortArray {
public static void main(String[] args) {
	int a[] = {8,10,6,22,80,70,56,21,17,18};
	int value = 8;
	int result = Arrays.binarySearch(a, value);
	System.out.println(result);
	Arrays.sort(a);
	System.out.println( "Sorted Array");
	for (int i =0; i < a.length;i++) {
		System.out.println(a[i]);
	}
}
	
}
