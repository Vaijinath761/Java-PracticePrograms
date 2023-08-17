package PracticeProgram;
import java.util.Scanner;
public class StrongNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean b=isStrong(n);
		if(b)
			System.out.println(n+" is a strong Number");
		else
			System.out.println(n+" is not a strong Number");
		

	}
	static boolean isStrong(int x)
	{
		int sum=0,temp=x;
		while(x!=0)
		{
			int d=x%10;
			sum=sum+getFact(d);
			x=x/10;
		}
		return sum==temp;
	}
	static int getFact(int z)
	{
		int fact=1;
		while(z>1)
		{
			fact=fact*z;
			z--;
		}
		return fact;
				
	}

}
