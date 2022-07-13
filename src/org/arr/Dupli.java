package org.arr;

public class Dupli {

	public static void main(String[] args) {
		int n[] = {10,20,20,30,30,30,10};
		System.out.println(n[0]);
		for (int i = 1; i < n.length; i++) {
			if(n[i]==n[i-1]) { 
				continue;
			}
		    System.out.println(n[i]);
			
		}
			
		
	}
}
