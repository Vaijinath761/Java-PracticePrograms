
//WJP to read 3 integer values from the user & print smallest value 

package PracticeProgram;
import java.util.Scanner;


public class SmallestNumberIn3digitTernary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int m=(a<b && a<c && a<d)?a:(b<c && b<d)?b:(c<d)?c:d;
		
		System.out.println(m+" is a smallest number");

	}

}
