package org.arr;

public class ArrMtds {

	private static void arrMethod(float x[]) {
		for (float e : x) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		float a[] = {2,3,1,22};
		arrMethod(a);
	}
}
