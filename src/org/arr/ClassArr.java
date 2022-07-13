package org.arr;

public class ClassArr {
	 
		public static void main(String args[]){  
		//declaration and initialization of array  
		//int arr[]={4,4,5};  
		//getting the class name of Java array  
		//Class c=arr.getClass();  
		//String name=c.getName();  
		//printing the class name of Java array   
		//System.out.println(name);  
			// public static void main(String[] args) {  
			        //declaring a source array  
			        char[] copyFrom = { 'd', 'e', 'p', 'r', 'e', 'e', 'e',  
			                'i', 'n', 'a', 't', 'e', 'd' };  
			        //declaring a destination array  
			        char[] copyTo = new char[7];  
			        //copying array using System.arraycopy() method  
			        System.arraycopy(copyFrom, 2, copyTo, 0, 4);  
			        //printing the destination array  
			        System.out.println(String.valueOf(copyTo));  
			   // }   
		}  
}
