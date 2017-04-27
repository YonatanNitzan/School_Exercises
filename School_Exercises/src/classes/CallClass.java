package classes;

import java.util.LinkedList;
import java.util.Scanner;

public class CallClass {

	public static void main(String[] args) {
		/* Variable declaration */
		LinkedList<String> actions = new LinkedList<String>();
		String inS;
		int inI;
		boolean run = true, passChange = true;
		Human h1 = new Human();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		/* Action list setting */
		try
		{
			actions.add("Get first name");
			actions.add("Change first name");
			actions.add("Get family name");
			actions.add("Change family name");
			actions.add("Get ID");
			actions.add("Get Gender");
			actions.add("Get balance");
			actions.add("Add money");
			actions.add("Subtract money");
			actions.add("Change account password");
		}
		catch(Exception e)
		{
			
		}
		
		/* First name setting */
		System.out.print("Enter human's first name: ");
		inS = sc.next();
		h1.setName(inS);
		
		/* First name setting */
		System.out.print("Enter " + h1.getName() + "'s family name: ");
		inS = sc.next();
		h1.setFname(inS);
		
		/* Family name setting */
		System.out.print("Enter " + h1.getName() + " " + h1.getFname() + "'s gender: ");
		inS = sc.next();
		h1.setGender(inS);
		
		/* ID setting */
		System.out.print("Enter " + h1.pronoun() + " ID number: ");
		inS = sc.next();
		h1.setId(inS);
		
		/* Password setting */
		System.out.print("Enter " + h1.pronoun() + " bank account password: ");
		inS = sc.next();
		h1.setBankPass(inS);
		
		/* Money setting */
		System.out.print("Enter " + h1.pronoun() + " initial balance (USD): ");
		inI = sc.nextInt();
		h1.setMoney(inI);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nEnter an action to perfrom:");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < actions.size(); i++)
		{
			System.out.println((i+1) + " - " + actions.get(i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		while(run)
		{
			System.out.print("\nEnter the desired action: ");
			try
			{
				inI = sc.nextInt();
			}
			catch (Exception e1)
			{
				System.out.println("That is not a number!");
				inS = sc.next();
				continue;
			}
			switch (inI) {
			case 1:
				System.out.println("Account's name: " + h1.getName());
				break;
			case 2:
				System.out.print("Enter new name: ");
				inS = sc.next();
				h1.setName(inS);
				break;
			case 3:
				System.out.println("Account's family name: " + h1.getFname());
				break;
			case 4:
				System.out.print("Enter new family name: ");
				inS = sc.next();
				h1.setFname(inS);
				break;
			case 5:
				System.out.println("Account's ID number: " + h1.getId());
				break;
			case 6:
				System.out.println("Account's gender: " + h1.getGender());
				break;
			case 7:
				System.out.println("Account's balance: " + h1.getMoney() + " USD");
				break;
			case 8:
				System.out.print("Enter added amount of money: ");
				inI = sc.nextInt();
				h1.setMoney(h1.getMoney() + inI);
				break;
			case 9:
				System.out.print("Enter subtracted amount of money: ");
				inI = sc.nextInt();
				h1.setMoney(h1.getMoney() - inI);
				break;
			case 10:
				while(passChange)
				{
					System.out.print("To change the account's password "
							+ "please enter the old password: ");
					inS = sc.next();
					if(h1.checkPass(inS))
					{
						System.out.print("Correct input. Enter new password: ");
						inS = sc.next();
						h1.setBankPass(inS);
						passChange = false;
					}
					else
					{
						System.out.println("\nIncorrect input. Please try again.\n");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				passChange = true;
				break;
			case 666:
				System.out.print("Terminating... \nIn ");
				for (int i = 5; i > 0; i--)
				{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Terminated");
				run = false;
				break;
			default:
				System.out.println("That is not a viable action!");
				break;
			}
		}
	}
}
