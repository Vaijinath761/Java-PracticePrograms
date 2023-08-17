

//WJP to read 3 integer values from user & print smallest one

package PracticeProgram;
import java.util.Scanner;

public class SmallestNumberIn3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int small=a;
		
		if(b<small)
			small=b;
		
		if(c<small)
			small=c;
		
		System.out.println("Smallest value is :"+small);

	}

}
