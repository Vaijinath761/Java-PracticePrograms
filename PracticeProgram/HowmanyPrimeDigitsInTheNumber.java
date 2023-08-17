
//Define a method to return how many prime digits present in the number


package PracticeProgram;

import java.util.Scanner;

public class HowmanyPrimeDigitsInTheNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=countPrimeDigits(n);
		System.out.println(n+" Number has "+count+" Prime Digits");
		
	}
	static int countPrimeDigits(int x)
	{
		int count=0;
		while(x!=0)
		{
			int d=x%10;
			if(d==1||d==2||d==3||d==5||d==7)
				count++;	
			x=x/10;
		}
		return count;
	}

}
