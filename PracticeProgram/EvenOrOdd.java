
//User entered number is even or odd

package PracticeProgram;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		if(n/2*2==n)
			System.out.println(n+"  is a Even number");
		else
			System.out.println(n+" is a odd number");
		

	}

}
