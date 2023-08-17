
//WJP to read 4 double type values from user & print bigger values


package PracticeProgram;

import java.util.Scanner;

public class DoubleBigValueTernarry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		double m=(a>b && a>c && a>d)?a:(b>c && b>d)?b:(c>d)?c:d;
		
		System.out.println(m+" is a biggest number");
		
		
	}

}
