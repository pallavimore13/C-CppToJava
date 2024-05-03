class Main
{
	public static void main(String[] args)
	{
		int value = 3;
		
		switch(value)
		{
			case 1:
				System.out.println("Value is 1");
				break;
			case 2:
				System.out.println("Value is 2");
				break;
			case 3:
				System.out.println("Value is 3");
				break;
			case 4:
				System.out.println("Value is 4");
				break;
			default:
				System.out.println("Value is other than 1,2,3,4");
		}
	}
}

class Main1
{
	public static void main(String[] args)
	{
		char grade = 'B';
		
		switch(grade)
		{
			case 'A':
			System.out.println("Excellent");
			break;
			
			case 'B':

			case 'c':
			System.out.println("well done");
			break;
			
			case 'D':
			System.out.println("You Passed");
			break;
			
			case 'F':
			System.out.println("Better try again");
			break;
			
			default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is" +grade);
		
	}
}

class Main2
{
	public static void main(String[] args)
	{
		int i;
		for(i = 0; i<10;i++)
		{
			if(i==5 || i == 6){
				System.out.println("Skipping from display using continue statement" +i);
			}
			continue;
		}
		System.out.println("\n" +i);
	}
}




