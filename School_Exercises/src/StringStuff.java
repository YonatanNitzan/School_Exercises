import java.util.Scanner;

public class StringStuff {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String x, y, z;
		
		System.out.print("Enter the student's name: ");
		x = reader.nextLine();
		
		System.out.print("Enter the student's grade: ");
		y = reader.nextLine();
		
		System.out.print("Enter the student's school: ");
		z = reader.nextLine();
		
		System.out.println("The student " + x + " is in grade " + y + " in the school: " + z);
		
		System.out.print("What is your first name? ");
		x = reader.next();
		
		System.out.print("What is your last name? ");
		y = reader.next();
		
		System.out.print("What is your birth-year? ");
		z = reader.next();
		
		System.out.print("Your name is: " + x + " " + y + " and you were born in " + z);
	}

}
