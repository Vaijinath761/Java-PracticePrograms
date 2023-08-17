package PracticeProgram;
import java.util.Scanner;
public class PerfectNumberRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int n=sc.nextInt();
		for(int v=1;v<=n;v++)
		{
		boolean b=isPerfect(v);
		if(b)
			System.out.println(v+" is a perfect Number");
		}

	}
	static boolean isPerfect(int x)
	{
		int sum=0;
		for(int i=1;i<=x/2;i++)
		{
			if(x%i==0)
				sum=sum+i;
				
		}
		return sum==x;
	}

}
