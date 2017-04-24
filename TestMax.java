// Program to test maximum of two numbers
import java.util.*;

public class TestMax {
	/** Main method */
	public static void main(String[] args) {
		int yandno;
		String choiceString = " ";
		char choice;
		Scanner user_input = new Scanner(System.in);
		do {
			System.out.println("Please enter the first integer");
			int i = user_input.nextInt();
			System.out.println("Please enter the second integer");
			int j = user_input.nextInt();
			int k = max(i, j);
			System.out.println("The maximum between " + i + " and " + j
					+ " is " + k);
			System.out.println("Continue? y or n");
			choiceString = user_input.next();
			choice = choiceString.charAt(0);

		} while (choice != 'n');
	}

	/** Return the max between two numbers */
	public static int max(int num1, int num2) {
		int result;
		if (num1 > num2)
			result = num1;
		else
			result = num2;
		return result;
	}
}