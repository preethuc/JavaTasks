package org.rough;

import java.util.Arrays;

public class Rough1 {
		// Main driver method
		/*public static void main(String[] args)
		{
			// Get the Array
			int intArr[] = { 10, 20, 15, 22, 35 };

			// To convert the elements as List
			System.out.println("Integer Array as List: "
							+ Arrays.asList(intArr));
		}*/
	// Java program to demonstrate
	// Arrays.binarySearch() method

	
		public static void main(String[] args)
		{

			// Get the Array
			int intArr[] = { 10, 20, 15, 22, 35 };

			Arrays.sort(intArr);

			int intKey = 10;

			System.out.println(
				intKey
				+ " found at index = "
				+ Arrays
					.binarySearch(intArr, 1, 3, intKey));
		}
	}

		
	


