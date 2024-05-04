import java.util.Scanner;

class Multiplication
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = Table(num);
		System.out.println("The result is" + result);
		
	}
	public static int Table(int x)
	{
		for(int i = 0; i < 10;i++){
			System.out.println(x*i);
		}
		return x*10;
	}
}
class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int result = reverse(num);
		System.out.println("The reversed number is =" +result);
		
		
	}
	public static int reverse(int n)
	{	
		//int n;
		int res = 0;
		int rem = 0;
		
		while( n != 0)
		{
			rem = n % 10;
			res = res*10 + rem;
			n /= 10;
		}
		//System.out.println(res);
		return res;
		
	}
}









