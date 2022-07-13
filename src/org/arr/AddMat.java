package org.arr;

public class AddMat {
    public static void main(String[] args) {
	
    	 int a[][] = {{2,3,4,1},{9,7,2,3}};
 		 int b[][] = {{5,6,4,2},{2,5,8,3}};	
 		  
 		 int c[][] = new int [2][3];
 		 for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				//c[i][j] = a[i][j]+b[i][j]; //addition matrix
				c[i][j] = a[i][j]*b[i][j]; //multiplication matrix
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
    }
	
}
