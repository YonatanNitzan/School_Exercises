import java.util.Scanner;

public class P119_E11 {

	public static void main(String[] args) {
		int grades[][] = new int[10][10];
		int[] ids = new int[10];
		int id = 1;
		int grade = 0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		for(int i = 0; id != 0; i++)
		{
			id = s.nextInt();
			ids[i] = id;
			for(int j = 0; grade != 999; j++)
			{
				grade = s.nextInt();
				if(grade == 999)
					break;
				grades[i][j] = grade;
			}
		}
		for(int i = 0; i < 10; i++)
		{
			System.out.print(ids[i] + " - ");
			for(int j = 0; j < 10; j++)
			{
				
				System.out.print(grades[i][j] + ", ");
			}
			System.out.println("");
		}
	}
}