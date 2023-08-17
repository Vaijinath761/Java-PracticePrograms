
//Define a method to return true if the no is special two digit no other wise return false


package PracticeProgram;
import java.util.Scanner;

public class SpecialNoOrNotReturn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int d1=n/10;
		int d2=n%10;
		int sum=d1+d2+d1*d2;
		boolean x=special(n,sum);
		
		System.out.println(x);

	}
	public static boolean special(int n,int x)
	{
	
	if(n==x)
		return true;
	else
		return false;
	}
	
	
				

}
