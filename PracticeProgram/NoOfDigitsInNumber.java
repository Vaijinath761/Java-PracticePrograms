
//Define a method to return how many digits present in the number

package PracticeProgram;
import java.util.Scanner;
public class NoOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=countOfDigits(n);
		System.out.println("sum of digits: "+sum);

	}
	static int countOfDigits (int x)
	{
		int count=0;
		do {
			 count++;
			 x=x/10;
		   }while(x!=0);
		return count;
		
	}

}
