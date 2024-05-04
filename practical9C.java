import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String input = sc.nextLine();
		
		int length = input.length();
		
	}
}

class Main1 {
	    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line of string:");
		String line = scanner.nextLine();
		int vowels = 0, consonants = 0, digits = 0, spaces = 0;

		for (int i = 0; i < line.length(); i++) {
		    char ch = line.charAt(i);
		    if (Character.isLetter(ch)) {
		        ch = Character.toLowerCase(ch);
		        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		            vowels++;
		        } else {
		            consonants++;
		        }
		    } else if (Character.isDigit(ch)) {
		        digits++;
		    } else if (Character.isWhitespace(ch)) {
		        spaces++;
		    }
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digits: " + digits);
		System.out.println("White spaces: " + spaces);
		scanner.close();
	    }
}


