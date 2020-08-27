package Iteration;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  upto which you want to disp:");
		int userNumber = sc.nextInt();
		
		int num1,num2,num3;
		
		num1 = 0;
		num2 = 1;
		
		System.out.println(num1+" " +num2 );
		
		for(int i=0;i<userNumber-2;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(" "+num3);
		}
	}
	

}
