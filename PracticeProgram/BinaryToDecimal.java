package PracticeProgram;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Binary Number");
		int n=sc.nextInt();
		int dec=binToDec(n);
		System.out.println("Decimal equalance of "+n+" is "+dec);

	}
	static int binToDec(int bin)
	{
		int dec=0,pw=1;
		do {
			int r=bin%10;
			dec=dec+r*pw;
			pw=pw*2;
			bin=bin/10;
		}while(bin!=0);
		return dec;
	}

}
