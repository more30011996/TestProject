package ControlStatement;

import java.util.Scanner;

public class MAximumNumber {
	//WAP to display maximum among three  number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number1:");
		
		 num1=sc.nextInt();
		 
		 System.out.println("Enter the number2:");
			
		 num2=sc.nextInt();
		 
		 System.out.println("Enter the number3:");
			
		 num3=sc.nextInt();
		 
		 if(num1>num2)
		 {
			 System.out.println(num1+"is greter is:");
		 }
		 else if(num2>num3)
		 {
			 System.out.println(num2+"is greater is");
		 }
		 else
		 {
			 System.out.println(num3+"gretaer is");
		 }
		 
		
		 

	}

}
