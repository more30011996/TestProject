package ControlStatement;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("the given number is even"+num);
		}
		else{
			
			System.out.println("The  number is odd"+num);
		}
		
		System.out.println("Ends here");
		
		
	}

}
