package PracticeProgram;
import java.util.Scanner;

public class DiseriumOrNot {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs=isDiserium(n);
		if(rs)
			System.out.println(n+" is a Diserium");
		else
			System.out.println(n+" is not a Diserium");

	}
	static boolean isDiserium(int x)
	{
		int sum=0,temp=x;
		int dc=countDigits(x);
		while(x!=0)
		{
			
			int d=x%10;
			sum=sum+pow(d,dc);
			dc--;
			x=x/10;
		}
		return sum==temp;
		
	}

	static int countDigits(int n)
	{
		int count=0;
		do {
			count++;
			n=n/10;
			
		}while(n!=0);
		return count;
	}
	static int pow(int n,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*n;
		    p--;
		}
		return prod;
	}
	
}
