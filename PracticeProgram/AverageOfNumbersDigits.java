
//WJP to define a method to return average of digits

package PracticeProgram;

import java.util.Scanner;

public class AverageOfNumbersDigits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		double avg=averageOfDigits(n);
		System.out.println("Average of Digits: "+avg);
		
		
	}
	
	static double averageOfDigits(int x)
	{
		double avg=0;
		int sum=0;
		int count=0;
		
		do
		{
			count++;
			int d=x%10;
			sum=sum+d;
			x=x/10;
			
		}while(x!=0);
		avg=sum/count;
		return avg;
	}

}
