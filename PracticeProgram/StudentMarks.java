
/*1.	WJP to read the four subject marks obtained student and print is result like distinction, first class second class , pass, fail */

package PracticeProgram;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stusends 4 subjects obtained marks");
		
		double p=sc.nextDouble();
		double c=sc.nextDouble();
		double m=sc.nextDouble();
		double b=sc.nextDouble();
		
		
		
		
		double sum=p+c+m+b;
		double total=400d;
		
		 if(p<35||c<35||m<35||b<35)
			System.out.println("Student fail");
		 
		 else if((sum/total*100)>=35 && (sum/total*100)<50 )
			 
			 System.out.println("Student pass");
		
		else if((sum/total*100)>=85 && (sum/total*100)<=100)
			System.out.println("Stusent passed with distinction");
		
		else if((sum/total*100)>=60 && (sum/total*100)<85)
			System.out.println("Student passed with first class");
		
		else if((sum/total*100)>=50 && (sum/total*100)<60)
			System.out.println("Student passed with second class");
			
		
		
		

	}

}
