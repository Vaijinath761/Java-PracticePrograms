
//Define a method to return the sum of first natural number

package PracticeProgram;
import java.util.Scanner;

public class SumOfnNumbers {
	
	static int print(int x)
	{
		/*  for(int i=1;i<=x;i++)
		{
			sum=sum+i;
		}
			return sum;
			*/
		
		int sum=0;
		while(x>0)
		{
			sum=sum+x;
			x--;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");

		int n=sc.nextInt();
		int sum=print(n);
		System.out.println(sum);


	}

}
