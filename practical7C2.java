import java.util.Scanner;
class PalindromeNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		boolean result = checkPalindrome(num);
		if(result)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not palindrome");
		}
		
	}
	public static boolean checkPalindrome( int num)
	{	
		int temp = num;
		int res = 0;
		int rem;
		
		while(temp != 0)
		{
			rem = temp % 10;
			res = res*10 + rem;
			temp = temp/10;
		}
		return num == res;

		
	}
}
