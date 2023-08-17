package PracticeProgram;

import java.util.Scanner;

public class PalindromeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean b=isPolindrome(n);
		if(b)
			System.out.println(n+" is a polindrome number");
		else 
			System.out.println(n+" is not a polindrome number");
		

	}
	static boolean isPolindrome(int x)
	{
		int num=x;
		int prod=0;
		while(x!=0)
		{
			int d=x%10;
			prod=prod*10+d;
			x=x/10;
		}
		return prod==num;
				
	}

}
