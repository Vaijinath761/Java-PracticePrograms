

//WJP read one integer value from the user and print integer is 2digit number or not


package PracticeProgram;
import java.util.Scanner;
public class TwoDigitNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(n>=-99 && n<=-10 || n>=10 && n<=99)
			System.out.println("It is a Two digit Number");
		else
			System.out.println("It is not a Two digit Number");

	}

}
