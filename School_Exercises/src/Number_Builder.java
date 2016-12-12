import java.util.LinkedList;
import java.util.Scanner;

public class Number_Builder{

	static LinkedList<Integer> inputs = new LinkedList<Integer>();
	private static int input, sum, counter;
	private static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		while(true)
        {
        	try
        	{
	        	System.out.print("Enter a digit: ");
	        	if(counter == 0)
	        		input = scanner.nextInt();
	        	else
	        		input = scanner.nextInt() * (10*counter);
		        inputs.add(input);
		        counter += 1;
        	}
        	catch(Exception e)
        	{
        		break;
        	}
        }
        
        for (double i: inputs)
        {
           sum += i;
        }
        
        System.out.println("\nThe number is: " + sum);
	}
}