package com.vandana.java;
import java.util.Arrays;

public class RandomArray {
	
	 static void shuffle(int arr[]) {
		  int random , temp ;
		  for(int i = arr.length-1 ;i >0 ; i--) {
			  
         //	 indexing random 
			 random = (int)(Math.random() * (i+1));
			temp = arr[random] ;
			arr[random] = arr[i];
			arr[i] = temp ;
		  }
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		System.out.println("Actual array : "+ Arrays.toString(arr));
		shuffle(arr);
		System.out.println("shuffled array : " + Arrays.toString(arr));
		

	}

}
