package com.question2;

import java.util.Scanner;
public class Arrdemo {

	public static void main(String[] args) {
	
		System.out.println("Enter 5 numbers");
		int[] arr=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			
			System.out.println("value"+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Odd values are:");
		
		for(int i=0;i<5;i++) {
			
			
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
