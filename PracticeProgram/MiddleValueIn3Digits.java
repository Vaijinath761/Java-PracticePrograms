
//WJP  to Read 3 integer value from the user and print middle one


package PracticeProgram;
import java.util.Scanner;
public class MiddleValueIn3Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a<c||a>c && a<b)
		System.out.println(a+" is the middle Number");
		
		else if(b>a && b<c||b>c && b<a)
			System.out.println(b+" is the middle Number");
		
		else
			
			System.out.println(c+" is the middle Number");

	}

}
