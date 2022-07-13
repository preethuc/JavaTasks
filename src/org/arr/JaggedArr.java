package org.arr;

public class JaggedArr {

	public static void main(String[] args) {
		int x[] = {2,3,4,5,6};
		int y[] = { 4,5,2,3,4};
		int a[][] = {
				{1,2,3,4},
				{2,3,2},
				{2,1,3,2,4}
		            };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(" " + a[i][j]  );
			}
			System.out.println();
		}
		
	}
}
