package PracticeProgram;

import java.util.Scanner;

public class XylemOrPhloem {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs=isXylemOrPhloem(n);
		if(rs)
			System.out.println(n+" is a Xylem");
		else
			System.out.println(n+" is a Phloem");
		

	}
	static boolean isXylemOrPhloem(int x)
	{
		int l=x%10;
		x=x/10;
		int mid=0;
		while(x>9)
		{
			mid=mid+x%10;
			x=x/10;
		}
		int ed=l+x;
		return mid==ed;
	}

}
