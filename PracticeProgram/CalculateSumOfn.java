package PracticeProgram;
import java.util.Scanner;
public class CalculateSumOfn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=sumOfDigits(n);
		System.out.println("sum of digits: "+sum);

	}
	static int sumOfDigits (int x)
	{
		int sum=0;
		while(x!=0)
		{
			int d=x%10;
			sum=sum+d;
			x=x/10;
			
		}
		return sum;
		
	}

}
