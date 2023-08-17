
//WJP read one integer value from user print integer is two digit number or not


package PracticeProgram;
import java.util.Scanner;


public class TwoDigitNumbetrOrNotTernarry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int n=sc.nextInt();
		
		String st=(n>=-99&&n<=-10||n>=10&&n<=99)?"is a two digit number":"Not a two digit number";
				
		System.out.println(n+" "+st);

	}

}
