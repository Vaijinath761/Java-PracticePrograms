
//WJP to perfect number



package PracticeProgram;
import java.util.Scanner;
public class PerfectNumber
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
	 boolean b=isPerfect(n);
	 if(b)
		 System.out.println(n+" is Perfect Number");
	 else
		 System.out.println(n+" is not Perfect Number");
	 
	}
	/*static boolean isPerfect(int x)
	{
	    int sum=0;
		for(int i=1;i<=x/2;i++)
		{
			if(x%i==0)
				sum=sum+i;
				
		}
		return sum==x;
		
	}*/
	
	
	static boolean isPerfect(int x)
	{
		int sum=0;
		for(int i=1;i*i<=x;i++)
		{
			if(x%i==0)
			{
				sum=sum+i;
			if(i!=1)
				sum=sum+x/i;
			}
			
		}
		return sum==x;
	
	}
	

}
