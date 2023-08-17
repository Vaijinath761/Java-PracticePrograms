
//WJP to define a method to return sum of square of digits

package PracticeProgram;

import java.util.Scanner;

public class SumOfSquareOfDigits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int sum=sumOfdigits(n);
		System.out.println("Sum of square of digits: "+sum);
	}
	static int sumOfdigits(int x)
	{
		int sum=0;
		while(x!=0)
		{
		int d=x%10;
		sum=sum+d*d;
		x=x/10;
		}
		return sum;
		
		
	}

}
