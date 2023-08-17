
//WJP to define a method to return true if the year is leap year otherwise return false


package PracticeProgram;

import java.util.Scanner;

public class LeapYearReturnTrueOrFalse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year in yyyy");
		
		int yy=sc.nextInt();
		
		boolean b=leapYear(yy);
		
		System.out.println(b);
		

	}
	
	public static boolean leapYear(int n)
	{
		if(n%4==0 && n%100!=0 || n%400==0)
			
			return true;
		else
			return
					false;
			
	}

}
