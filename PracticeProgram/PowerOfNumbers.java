package PracticeProgram;
import java.util.Scanner;
public class PowerOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		int pow=power(a,b);
		System.out.println(pow);

	}
	static int power(int n,int p)
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
