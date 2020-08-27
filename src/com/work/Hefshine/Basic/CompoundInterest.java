package com.work.Hefshine.Basic;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double principal=2000,time=5,n=12;
		double rate=0.08;
		
		
		double intrest=principal*(Math.pow((1+rate/100),time));
		
		System.out.println("The calculated intrest is:"+intrest);

		
		
	}

}
