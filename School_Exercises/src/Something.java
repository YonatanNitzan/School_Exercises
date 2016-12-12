import java.util.Scanner;

public class Something {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String string = reader.next();
		int length = string.length();
		char ch;
		int incription = reader.nextInt();
		
		for(int i = 0; i < length; i++)
		{
			ch = string.charAt(i);
			ch += incription;
			System.out.print(ch);
		}
	}
}