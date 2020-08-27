package ControlStatement;

import java.util.Scanner;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1,number2,number3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number for maximum and minimum:");
		
		System.out.println("Enter the number1:");
		number1=sc.nextInt();
		System.out.println("Enter the number2:");
		number2=sc.nextInt();
		//System.out.println("Enter the number3:");
		//Snumber3=sc.nextInt();
		if(number1>number2)
		{
			
			
				System.out.println("number1 is maximum:"+number1);
				
						
		}
		else
		{
			System.out.println("number2 is minimum:"+number2);
		}
		
		

	}

}
