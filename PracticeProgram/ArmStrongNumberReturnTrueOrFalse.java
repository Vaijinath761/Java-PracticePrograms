
//Define a method to return if the number is Armstrong number otherwise false

package PracticeProgram;
import java.util.Scanner;
public class ArmStrongNumberReturnTrueOrFalse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean b=isArmStrong(n);
		if(b)
		
			System.out.println(n+" is an Armstrong");
		
		else
			System.out.println(n+" is not an Armstrong");
		
	}
	static boolean isArmStrong(int x)//153,371
	{
		int sum=0,temp=x;
		while(x!=0)
		{
			int d=x%10;
			sum=sum+d*d*d;
			x=x/10;
		}
		return sum==temp;
	}

}
