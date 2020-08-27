
package ControlStatement;

import java.util.Scanner;

public class EqulateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s1,s2,s3;

		Scanner  sc=new Scanner(System.in);
		
		System.out.println("Enter the side of triangle:");
		
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		if(s1==s2&&s2==s1)
		{
			System.out.println("Triangle is equilteral:");
		}
		else if(s1==s2||s2==s3||s3==s1)
		{
			System.out.println("Triangle in isosceles");
		}
		else
		{
			System.out.println("Triangle is scalene");
		}
		
	}

}
