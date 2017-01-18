import java.util.Scanner;

public class Java_Courses {

	//Variable setup
	static Scanner sc = new Scanner(System.in); //Declaring a scanner
	static String in; //Input holder variable
	
	public static void main(String[] args) {
		//Printing a list of the courses
		System.out.println("Courses: \n" 
				+ "1. Variables and data types \n2. Basic output \n3. Basic input \n4. "
				+ "If \n5. While \n6. For \n");
		
		System.out.print("Choose a course by typing it's name, or continue from where you left off by typing \"Continue\": ");
		in = sc.nextLine(); //User input of chosen course
		System.out.println("You chose the " + in.toLowerCase() + " course!\n");
		
		switch(in.toLowerCase())
		{
		case "basic output":
			basicOut();
			break;
		case "continue":
			
		default: //If non of the above are chosen:
			System.out.println("But sadly, this course isn't avalible");
		}
	}
	
	
	private static void basicOut()
	{
		System.out.println("In this course, "
				+ "I'll explain to you how to make a simple output using the "
				+ "'System.out.println()' command.");
		System.out.println("In the simplest way, 'System.out.println()' can be used "
				+ "to print a String like so:\n");
		System.out.println("System.out.println(\"I'm being outputed!\")");
		System.out.println("\nThis prints out:");
		System.out.println("\nI'm being printed!");
		System.out.println("\n Important note: While printing a string you MUST include the quotes, it wouldn't work without them!");
		System.out.println("\n");
	}
}