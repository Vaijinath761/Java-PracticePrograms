
//Even or Odd Using Switch & array

package PracticeProgram;
import java.util.Scanner;
public class EvenOrOddString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		String []str= {" Even"," odd"};
		
		System.out.println(n+" is"+str[n%2]);
	}

}
