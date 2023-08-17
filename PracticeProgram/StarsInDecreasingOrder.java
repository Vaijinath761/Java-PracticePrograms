package PracticeProgram;
import java.util.Scanner;
public class StarsInDecreasingOrder {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)//Number of lines
		{
			for(int j=1;j<=i;j++)//number of * in each line
			{
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
