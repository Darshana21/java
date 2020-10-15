package com.question1;

public class Main {

	public static void main(String[] args) {


		Avenger[] avenger=new Avenger[5];
		
		for (int i=0;i<5;i++)
		{
			avenger[i]=new Avenger();
			avenger[i].getDetails();
	    }
		
		
		
		
		for (int i=0;i<5;i++)
		{
			
			avenger[i].displayDetails();
	    }

	}}







