package ControlStatement;

import java.util.Scanner;

public class ProfitOrLOss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CostPrice:");
		double cp=sc.nextDouble();
		System.out.println("Enter the Selling price:");
		double sp=sc.nextDouble();
		
		if(cp-sp>0)
		{
			System.out.println("Loss:"+(cp-sp));
		}
		else if(cp-sp<0)
		{
			System.out.println("Profit:"+(sp-cp));
			
		}
		else
		{
			System.out.println("is value is netural");
		}
	}

}
