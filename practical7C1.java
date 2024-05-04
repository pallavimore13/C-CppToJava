class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int result = Fact(num);
		System.out.println("The result is =" +result);
		
		
	}
	public static int Fact(int a)
	{
		int fact = 1;
		if( a > 0){
			for(int i = 1; i <= a; i++){
				fact = fact*i;	
			}
			//System.out.println("The factorial is = " +fact);
			return fact;	
		}
		else
		{
			return 0;
		}
	}
	
}
