package com.work.Hefshine.Basic;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the days of the week:");
		
		day=sc.nextInt();
		
		if(day==1)
		{
			System.out.println("The Day is monday");
		}
		else if(day==2)
		{
			System.out.println("The day is tuesday");
		}
		else if(day==3)
		{
			System.out.println("The day is wenesnday");
		}
		else if(day==4)
		{
			System.out.println("The day is thuesday");
		}
		else if(day==5)
		{
			System.out.println("The day is friday");
		}
		else if(day==6)
		{
			System.out.println("The day is saturday");
			
		}
		else if(day==7)
		{
			System.out.println("The day is sunday");
		}
		else 
		{
			System.out.println("Invalid Error");
		}
		
	}
	
}

	
		

