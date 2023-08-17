
//WJP to print user entered number is +ve or -ve


package PracticeProgram;
import java.util.Scanner;
public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		if(n>=0)
			System.out.println("Entered Number is a Positive Number");
		
		else
			System.out.println("Entered Number is a Negative Number");

	}

}
