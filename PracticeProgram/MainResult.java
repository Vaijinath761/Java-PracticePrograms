package PracticeProgram;
import java.util.Scanner;
public class MainResult {
	
	
	static String getResult(int w,int x, int y,int z)
	{
		if(w<35||x<35||y<35||z<35)
		
			return "fail";
		
		
		double per=(w+x+y+z)/4.0;
		
		if(per>85)
			System.out.println("Distinction");
		
		else if(per>=60)
			System.out.println("first class");
		
		else if(per>=50);
		
		System.out.println("second class");
		
		
		else
			return "pass";
		
		
		
	}
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int p=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int b=sc.nextInt();
		String st=getResult(p,c,m,b);
		System.out.println("result is : "+st);

	}

}
