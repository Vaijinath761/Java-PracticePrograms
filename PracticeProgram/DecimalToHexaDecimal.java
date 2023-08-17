package PracticeProgram;
import java.util.Scanner;
public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal Number");
		int n=sc.nextInt();
		String st=decToHex(n);
		System.out.println(st);
		
		

	}
	/*static String decToHex(int dec)
	{
		String hex="";
		do {
			int d=dec%16;
			if(d<10)
				hex=d+hex;
			else if(d==10)
				hex='A'+hex;
			else if(d==11)
				hex='B'+hex;
			else if(d==12)
				hex='C'+hex;
			else if(d==13)
				hex='D'+hex;
			else if(d==14)
				hex='E'+hex;
			else if(d==15)
				hex='F'+hex;
			dec=dec/16;
	
			
		}while(dec!=0);
		return hex;
				
	}*/
	static String decToHex(int dec)
	{
		String hex="";
		do {
			int d=dec%16;
			if(d<10)
				hex=d+hex;
			else
				hex=(char)(d+55)+hex;
			dec=dec/16;
		}while(dec!=0);
		return hex;
	}
	
			

}


/*
  public static void main(String[] args
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the decimal number);
  int dec=sc.nextInt();
  String bn=decToBin(dec);
  System.out.println("Binary equalance of "+dec+" is "+bn);
  String ot=decToOct(dec);
  System.out.println("Octal equalance of "+dec+" is "+ot);
  String hx=decToHex(dec);
   System.out.println("Hexadecimal equalance of "+dec+" is "+hx);
   */
