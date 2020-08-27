package Iteration;

import java.util.Scanner;

public class PowerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int number,power,result=1,i;
		
		System.out.println("Enter the numberr:");
		number = sc.nextInt();
		
		System.out.println("Enter the power: ");
		power = sc.nextInt();
		
		for(i=1;i<=power;i++)
		{
			result = result*number;
		}
		System.out.println("The result is:"+ result);
	}

}
