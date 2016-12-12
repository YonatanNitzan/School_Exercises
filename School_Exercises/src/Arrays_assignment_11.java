import java.util.Scanner;

public class Arrays_assignment_11 {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int length, i = 0;
		
		System.out.print("Enter the array's length: ");
		length = reader.nextInt();
		
		int[] intArray = new int[length];
		
		while(i < length)
		{
			System.out.print("Enter a number to add to the list: ");
			intArray[i] = reader.nextInt();
			i++;
		}
		
		
		System.out.println("Original array:");
		for(int n : intArray)
		{
			System.out.print(n + ", ");
			n++;
		}
		
		reorderArray(intArray);
		
		System.out.println("\nEdited array:");
		for(int n : intArray)
		{
			System.out.print(n + ", ");
			n++;
		}
	}

	private static void reorderArray(int[] array) {
		for(int x = 0; x < array.length; x++)
		{
			if(x == 0)
			{
				if(array[x] < array[x+1])
					array[x] = array[x+1] + 1;
			}
			
			else if(x == array.length-1)
			{
				if(array[x] < array[x-1])
					array[x] = array[x-1] + 1;
			}
			
			else
			{
				if(array[x] < array[x+1])
					array[x] = array[x+1] + 1;
				
				if(array[x] < array[x-1])
					array[x] = array[x-1] + 1;
			}
		}
		
	}

}
