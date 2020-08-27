package com.work.Hefshine.Basic;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float basic,gross,DA,HRA;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Basic salary:");
		
		basic=sc.nextFloat();
		
		System.out.println("Enter the Gross Salary");
		
		gross=sc.nextFloat();
		
		if(basic<=1000)
		{
			DA=(float) (basic * 8.0);
			HRA=(float) (basic*0.2);
			  
		}
		else if(basic<=2000)
		{
			DA=(float) (basic*0.9);
			HRA=(float) (basic*0.25);
		}
		else
		{
			DA=(float) (basic*0.95);
			HRA=(float) (basic*0.30);
		}
		gross=basic+HRA+DA;
		System.out.println("Gorss Salary of the employee=%.2f"+gross);
	}

}
