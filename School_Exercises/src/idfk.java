import java.util.Scanner;

public class idfk {

	static Scanner sc = new Scanner(System.in);
	static String in;
	
	public static void main(String[] args) {
		System.out.println("Choose a course: ");
		in = sc.nextLine();
		System.out.println("You chose the " + in + " course!");
		switch(in)
		{
		case "Basic output":
			basicOut();
			break;
		default:
			System.out.println("But sadly, this course isn't avalible");
		}
	}
	
	
	private static void basicOut()
	{
		System.out.println("In this course, "
				+ "I'll explain to you how to make a simple output using the "
				+ "'System.out.println()' command.");
		System.out.println("\nIn the simplest way, 'System.out.println()' can be used "
				+ "to print a String(If you dont know what a string is ");
		
	}
}