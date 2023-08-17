package PracticeProgram;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs=isHappy(n);
		if(rs)
			System.out.println(n+" is a Happy Number");
		else
			System.out.println(n+" is not a Happy Number");

	}
	static boolean isHappy(int x)//97
	{
		while(x>9)
		{
		int sum=0;
		do 
		{
			int d=x%10;
			sum=sum+d*d;
			x=x/10;
			
		}while(x!=0);
			x=sum;
		}
		return x==1||x==7;
	}

}
