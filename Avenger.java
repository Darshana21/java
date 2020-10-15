package com.question1;

import java.util.Scanner;
public class Avenger {

	
		
		String name,weapon,planet;
		int age,power;
		
		Scanner sc=new Scanner(System.in);
		
		public void getDetails() {
			
			System.out.println("Enter the Details:");
			System.out.println("name:");
			name=sc.nextLine();
			System.out.println("age:");
			age=sc.nextInt();
			System.out.println("power:");
			power=sc.nextInt();
			System.out.println("Weapon:");
			weapon=sc.next();
			System.out.println("planet:");
			planet=sc.next();
		}
		
		public void displayDetails() {
			System.out.println("name: 	"+name);
			System.out.println("age:	 "+age);
			System.out.println("power: 	"+power);
			System.out.println("weapon:	"+weapon);
			System.out.println("planet:	"+planet);
			
			
			
		}
	}


