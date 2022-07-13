package org.demo;

import java.util.Scanner;

public class TestPrgm1 {

	public static void main(String[] args) {
		/*int a[] = {1,2,8,10,5,22,11,6,18,17};
	    
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the values of array");
		int s  = n.nextInt();
		for (int i = 0; i < a.length; i++) {
			//int s  = n.nextInt();
			if (a[i]==s) {
				System.out.println("the given input is present ");
				
		    }
			else {
				System.out.println("Not an array value");
			}
		} 
		
			int a[] = {1,2,8,10,5,22,11,6,18,17};
		Scanner r = new Scanner(System.in);
		int s;
		System.out.println("Enter the values");
		for (int i = 0; i < a.length; i++) {
			 s = r.nextInt();
			System.out.println(a[i]);
		}
		 
		for (int i = 0; i < 10; i++) {
			System.out.println(a);
			if (a[i]==10) {
				return ;
				
			}
			else {
				return;
			}
		}
	}
}*/
		int a[] = {1,2,8,10,5,22,11,6,18,17};
		int s = 3;
		int isPresent = 0;
		System.out.println("Array values");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if (a[i]==s) {
				isPresent = 1;
			}
		}
		   if(isPresent==1) {
				System.out.println("Present");
			}
			else {
				System.out.println("Not Present");
			}
		
	}
}
