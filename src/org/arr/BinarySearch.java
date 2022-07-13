package org.arr;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int arrr[] = {10,200,3130,420,50}; 
	    int value=10;
	    Arrays.sort(arrr);
	    int result = Arrays.binarySearch(arrr,value);
	    //result prints the position of value 
	    System.out.println(result);
	   // for (int i : arrr) {
	    	//System.out.println(i);
		//}

       // if (result>0)
          //  System.out.println("that values is index found "+result);
        //else{
        //    System.out.println("you are specified worng keys");
       // }
	}

}
