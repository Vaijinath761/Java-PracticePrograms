
/*WJP to read one integer value from the user print Sanju if no is divisible by 3, print Geeta if no is divisible by 5, print Sanju Weds Geeta 
 * if no is divisible by both 3&5 otherwise print Breakup
 */




package PracticeProgram;

import java.util.Scanner;

public class SanjuWedsGeeta {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n=sc.nextInt();
		
		if(n%3==0 && n%5==0)
			System.out.println("Sanju Weds Geeta");
		
		else if(n%3==0)
		System.out.println("Sanju");
		
	 else if(n%5==0)
			System.out.println("Geeta");
		
		else
			System.out.println("Break up");
	}

}
