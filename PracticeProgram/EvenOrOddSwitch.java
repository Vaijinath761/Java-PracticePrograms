
//Even or Odd using switch


package PracticeProgram;
import java.util.Scanner;

public class EvenOrOddSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		switch(n%2)
		{
			case 0:System.out.println(n+" is a even number");
			break;
			case 1:System.out.println(n+" is a odd number");
		}
		

	}

}
