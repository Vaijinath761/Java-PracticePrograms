package PracticeProgram;
import java.util.Scanner;

public class HowmanyStrongNumber3Digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=countStrong(n);
		System.out.println("There are : "+count+" Strong Number");
		

	}
	static int countStrong(int range)
	{
		int count=0;
		for(int i=1;i<=range;i++)
		{
			boolean rs=isStrong(i);
			if(rs)
			{
				//System.out.println(i);
				count++;
			}
		}
		return count;
	}
	static boolean isStrong(int x)
	{
		int sum=0,temp=x;
		do {
			int r=x%10;
			sum=sum+getFact(r);
			x=x/10;
		}while(x!=0);
		
		return sum==temp;
		
	}
	static int getFact(int num)
	{
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		return fact;
				
	}

}
