package com.question3;

import java.util.Scanner;

public class sumArrDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter 5 numbers");
		int[] arr=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			
			System.out.println("value"+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		
	    	int sum=0;
           for(int i=0;i<5;i++)
           {
        	  
        	   	   sum=sum + arr[i];
			
		   }
           System.out.println("Sum =" +sum);

	}

}
