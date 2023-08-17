
//WJP to define a method to return Biggest among three number


package PracticeProgram;
import  java.util.Scanner;
public class BiggestMethod {
	static int getBiggest(int a,int b,int c)//called method
	
	{
		int big=(a>b && a>c)?a:(b>c)?b:c;
		return big;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		
		int big=getBiggest(x,y,z);//calling method
		
		System.out.println("Biggest number is "+big);
		

	}

}
