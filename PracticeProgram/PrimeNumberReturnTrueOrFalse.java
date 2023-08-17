package PracticeProgram;
import java.util.Scanner;
public class PrimeNumberReturnTrueOrFalse 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs=isPrimeNumber(n);
		if(rs)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
    }
	/* static boolean isPrimeNumber(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	} */
	
	
	static boolean isPrimeNumber(int x)
	{
		for(int i=2;i*i<=x;i++)//(Square root(n))
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
	

}
