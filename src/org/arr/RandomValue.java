package org.arr;

import java.util.Random;

public class RandomValue {
public static void main(String[] args) {
	   String[] arr={"str", "ftydtyd", "str", "4", "2"}; 
       Random r=new Random();    
       int randomNumber=r.nextInt(arr.length); 
       System.out.println(arr[randomNumber]); 
}
}
