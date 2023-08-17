
//Define a method to return the smallest among three double type values


package PracticeProgram;
import java.util.Scanner;

public class SmallestAmongThreeReturn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the double number");
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double small=getSmallest(a,b,c);//calling method
		
		System.out.println(small+" is the smallest number");
		
	}
	
	
	public static double getSmallest(double x,double y,double z) //called method
	{
		if(x<y && x<z)
			return x;
		else if(y<z)
			return y;
		else
			return z;
		
		
		
		
		
	}

}
