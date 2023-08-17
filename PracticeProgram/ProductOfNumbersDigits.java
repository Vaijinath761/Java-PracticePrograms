
//WJP to define a method to return product of digits


package PracticeProgram;

import java.util.Scanner;

public class ProductOfNumbersDigits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int product=productOfDigits(n);
		System.out.println("Product of Digits: "+product);
	}
	
	static int productOfDigits(int x)
	{
		int product=1;
		{
			if(x==0)
				return 0;
		}
		while(x>0)
		{
			int d=x%10;
			product=product*d;
			x=x/10;
						
		}
		return product;
	}

}
