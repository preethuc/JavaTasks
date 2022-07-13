package org.arr;

public class Single {
	public static void main(String[] args) {
		int a[] = new int [5];
		a[0]=10;
		a[1]=20;
		a[3]=40;
		//int a[]= {10,20,30,40,50,60};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Print third value " + a[2]);
	}
}
