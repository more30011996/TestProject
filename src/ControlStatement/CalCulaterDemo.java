package ControlStatement;

import java.util.Scanner;

public class CalCulaterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1,num2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		num1=sc.nextDouble();
		System.out.println("Enter the second number:");

		num2=sc.nextDouble();
		System.out.println("Enter the opertor(+,-,*,/):");
		
		char operator=sc.next().charAt(0);
		double result;
		switch(operator)
		{
			case '+':
			result=num1+num2;
			break;
			
			case '-':
				result=num1-num2;
				break;
				
			case '*':
				result=num1*num2;
				break;
				
			case '/':
				result=num1/num2;
				break;
				
			default:
				System.out.println("You have entered wrong operator:");
				return;
				
				
		}
		System.out.println(num1+" "+operator+" "+num2+":"+result);
	}
		
	

}
