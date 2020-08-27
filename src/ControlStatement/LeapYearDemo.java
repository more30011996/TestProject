package ControlStatement;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int year;
		boolean leap= false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the leap year:");
		year=sc.nextInt();
		if(year % 4==0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
					leap = true;
				else
					leap= false;
			}
			else
				leap = true;
		}
		else
			leap = false;
		
		if(leap)
			System.out.println(year+" is a leap year.");
		else
			System.out.println(year+"is not leap year");
	}

}
