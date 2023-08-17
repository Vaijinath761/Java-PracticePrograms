package PracticeProgram;
import java.util.Scanner;
public class Divisors {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		long starts=System.nanoTime();
		printDivisors(n);
		long end=System.nanoTime();
		System.out.println("time taken :"+(end-starts));
		
	}
	static void printDivisors(int n)
	{
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			System.out.println(i);
		}
		System.out.println(n);
	}

}
