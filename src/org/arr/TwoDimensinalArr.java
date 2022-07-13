package org.arr;

public class TwoDimensinalArr {

	public static void main(String[] args) {
		int m[][] = new int [3][4];
		m[0][0] = 30;
		m[0][1] = 40;
		m[0][2] = 50;
		m[0][3] = 60;
		m[1][0] = 20;
		m[1][1] = 70;
		m[1][2] = 20;
		m[1][3] = 10;
		m[2][0] = 30;
		m[2][1] = 10;
		m[2][2] = 15;
		m[2][3] = 10;
		
		System.out.println();
		for (int i = 0; i < m.length; i++) {
		  for (int j = 0; j < m[i].length; j++) {
			System.out.print(m[i][j] + " ");
		}
		  System.out.println();
		}
		
		
		
	}
	
	
}
