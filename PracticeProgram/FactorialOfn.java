
//.Define a method to return the factorial of n

package PracticeProgram;
import java.util.Scanner;
public class FactorialOfn {
	
	static int getFact(int n)//5 5*4*3*2*1
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int fc=getFact(n);
		System.out.println("Factorial is :"+fc);
	}

}
