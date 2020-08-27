package com.work.Hefshine.Basic;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1=20;
		int num2=40;
		
		System.out.println("Enter the first number:"+num1);
		System.out.println("Enter the second number:"+num2);
		System.out.println("Before swapping number:"+num1+" "+num2);
		
		int temp=num1;
			num1=num2;
			num2=temp;
		System.out.println("After the swapping number:"+num1+" "+num2);

	}

}
