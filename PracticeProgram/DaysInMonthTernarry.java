
//WJP to read month number from the user & print howmany days present in that month

package PracticeProgram;

import java.util.Scanner;

public class DaysInMonthTernarry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int n=sc.nextInt();
		
		String st=(n==1||n==3||n==5||n==7||n==8||n==10||n==12)?" 31 days in month":(n==4||n==6||n==9||n==11)?" 30 days in month":(n==2)?" 28 or 29 days in month":" Plese Enter values between 1 to 12";
		
		System.out.println(n+st);

	}

}
