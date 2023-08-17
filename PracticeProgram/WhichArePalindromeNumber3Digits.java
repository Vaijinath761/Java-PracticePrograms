package PracticeProgram;


public class WhichArePalindromeNumber3Digits {

	public static void main(String[] args) 
	{
		for(int i=101;i<=999;i++)
		{
			boolean rs=isPalindrome(i);
			if(rs)
				System.out.println(i);
		}
		
	}
	static boolean isPalindrome(int x)
	{
		int rev=0,temp=x;
		while(x!=0)
		{
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}
		return rev==temp;
	}

}
