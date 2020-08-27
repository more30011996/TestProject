package com.work.Hefshine.Basic;

public class ConvertDayInToYear {

	public static void main(String[] args) {
		
		
		int m=373,year,week,day;
		
		System.out.println("Enter the number of days");
		
		//year=372/356;
		year=m/365;
		m=m%365;
		
		System.out.println("The number of year:"+year);
		
		 week=m/7;
		 m=m%7;
		 
		 System.out.println("the number of week:"+week);
		 
		 day=m;
		 
		 System.out.println("no of the days:"+day);
	}

}
