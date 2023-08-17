
//	Define a method to take dd mm yyyy as a argument if the date is valid return “valid” otherwise return invalid


package PracticeProgram;

import java.util.Scanner;

public class YearValidOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		
		boolean x=print(dd,mm,yy);
		
		if(x==true)
			System.out.println("valid");
		else
			System.out.println("invalid");
		
	}
	
	public static boolean print(int x,int y,int z)
	{
		if(z<1)
			return false;
		else
			return true;
		
			
	}

}


