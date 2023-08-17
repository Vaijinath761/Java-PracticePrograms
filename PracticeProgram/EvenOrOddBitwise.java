

//Even or Odd using bitwise operation


package PracticeProgram;
import java.util.Scanner;

public class EvenOrOddBitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		if((n&1)==0)
			System.out.println(n+" is a Even number");
		else
			System.out.println(n+" is a Odd number");
	}

}
