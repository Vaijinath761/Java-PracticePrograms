
//Define a method to return reverse of a number

package PracticeProgram;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int revs=revers(n);
		System.out.println(n+" Number's reverse number is: "+revs);
		
	}
	static int revers(int x)
	{
		int rev=0;
		while(x!=0)
		{
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
			
		}
		return rev;
	}

}
