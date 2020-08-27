package ControlStatement;

import java.util.Scanner;

public class NumIsNegativeOrPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		number=sc.nextInt();
		
		if(number>0)
		{
			System.out.println("Number is positive"+number);
		}
		else if(number<0)
		{
			System.out.println("number is negative:"+number);
		}
		else
		{
			System.out.println("The given  number is zero:");
		}
		
	}

}
