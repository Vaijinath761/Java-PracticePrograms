

//Even or Odd Using conditional stmt


package PracticeProgram;
import java.util.Scanner;
public class EvenOrOddConditional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		String st=(n%2==0)?"Even":"Odd";
		
		System.out.println(n+" is "+st);

	}

}
