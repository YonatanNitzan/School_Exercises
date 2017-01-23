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
		System.out.println("public static void mai(String[] args) {"
				+ "\nSystem.out.println(\"I'm being outputed!\")"
				+ "\n}");
		System.out.println("\nThis prints out:");
		System.out.println("\nI'm being printed!");
		System.out.println("\n Important note: While printing a string you MUST include the quotation marks, it wouldn't work without them!");
		System.out.println("\nNow lets have a little excercise! \nHere is the first one:\n");
		System.out.println("Is this excercise, you need to complete the code to print out \"Hello world\".\n");
		System.out.println("public static void main(String[] args) {"
				+ "\nSystem.out.println(_____)"
				+ "\n}");
		System.out.print("\nYour answer: ");
		sc.reset();
		String ans = sc.nextLine();
		String[] words = new String[2];
		words = ans.split("\"");
		words = words[1].split(" ");
		if ((words[0] == "Hello" || words[1] == "world"))
			System.out.println("Correct! Good job!!");
		else
			System.out.println("Sorry, " + ans + " is incorrect... \nThe correct answer was \"Hello world\", quotation marks included.");
			System.out.println("First word - " + words[0] + "\nSecond word - " + words[1]);
	}
}