
//WJP to read 4 double type values from the user & print bigger value


package PracticeProgram;
import java.util.Scanner;
public class DoubleBigValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter double values");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		
		double big=a;
		
		if(b>big)
			big=b;
		
		if(c>big)
			big=c;
		
		
		if(d>big)
			big=d;
		
		System.out.println("Big value in Double is :"+big);
		

	}

}
