package ControlStatement;

import java.util.Scanner;

public class UpperCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet:");
		
		 m=sc.next().charAt(0);
		 if(m>=97 && m<=122)
		 {
			 System.out.println("Lower Case"+" "+m);
		 }
		 else if(m>=65 && m<=90)
		 {
			 System.out.println("Uppercsae"+" "+m);
		 }
		 else if(m>=48 && m<=57)
		 {
			 System.out.println("digit"+" "+m);
		 }
	}

}
