package ControlStatement;

import java.util.Scanner;

public class MarksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sub1,sub2,sub3,sub4,sub5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of sub1:");
		sub1=sc.nextInt();
		
		System.out.println("Enter the marks of sub2:");
		sub2=sc.nextInt();
		
		System.out.println("Enter the marks of sub3:");
		sub3=sc.nextInt();
		
		System.out.println("Enter the marks of sub4:");
		sub4=sc.nextInt();
		
		System.out.println("Enter the marks of sub5:");
		sub5=sc.nextInt();
		
		int Total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total sum is"+Total);
		int per = Total/5;
		System.out.println("persentage is:"+per);
		
		if(per>=90)
		{
			System.out.println("GRADE A");
		}
		else if(per>=80)
		{
			System.out.println("GRADE B");
		}
		else if(per>=70)
		{
			System.out.println("GRADE C");
		}
		else if(per>=60)
		{
			System.out.println("GRADE D");
		}
		else if(per>=40)
		{
			System.out.println("GRADE E");
		}
		else
		{
			System.out.println("GRADE F");
		}
	}
	

}
