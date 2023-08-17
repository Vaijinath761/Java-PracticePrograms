

//WJP to print user entered number is +ve or -ve conditional stmt

package PracticeProgram;

import java.util.Scanner;

public class PositiveOrNegativeTernarry {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int n=sc.nextInt();
		
		String st=(n>=0)?" is a Positive Number":" is a Negative Number";
		System.out.println(n+st);
		

	}

}
