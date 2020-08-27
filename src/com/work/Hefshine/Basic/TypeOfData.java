package com.work.Hefshine.Basic;

import java.util.Scanner;

public class TypeOfData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,result;
		double number,number1,number3;
		 float n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the int datatype:");
		System.out.println("Enter the number values:");
		 num1=sc.nextInt();
		 num2=sc.nextInt();
		 
		 result=num1+num2;
		 System.out.println("The given two number:"+result);
		 
		 
		 //System.out.println("Enter the two numbers:");
		 
		 number=sc.nextDouble();
		 number1=sc.nextDouble();
		  number3=number+number1;
		  System.out.println("The given two number:"+number3);
		  
		  
		  
		  n1=sc.nextFloat();
		  n2=sc.nextFloat();
		  n3=n1+n2;
		  System.out.println("The given the number:"+n3);
		
	}

}
