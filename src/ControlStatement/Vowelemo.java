package ControlStatement;

import java.util.Scanner;

public class Vowelemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		char alphabet;
		System.out.println("Enter the alphabet:");
		alphabet=sc.next().charAt(0);
		if((alphabet == 'a')||(alphabet == 'e')||(alphabet == 'i')||(alphabet == 'o')||(alphabet == 'u'))
		{
			System.out.println(alphabet+"is vowel");
			
		}
		else
		{
			System.out.println(alphabet+" is a consonant");
		}
	}
	
	

}
