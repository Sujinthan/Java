import java.util.Scanner;

public class StringManipulations {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string two strings
		System.out.print("Enter string one: ");
		String sOne = input.nextLine();

		System.out.print("Enter string two: ");
		String sTwo = input.nextLine();

		// Join/Concatenate the strings
		System.out.println("Both Strings Combined is: " + sOne.concat(sTwo));

		// Combined the strings
		String oneTwo = sOne + sTwo;
		System.out.println("The length of Both Strings combined is: "
				+ oneTwo.length());

		// Determine if both strings have the same contents
		if (sOne.equals(sTwo)) {
			System.out.println("Both strings have the same contents");
		} else {
			System.out.println("Both strings have different contents");
		}

		System.out
				.println("The distance between both strings using compareTo is :"
						+ sOne.compareTo(sTwo));

		// Determine the second character in string one
		System.out.println("The Second Character in String One is: "
				+ sOne.charAt(1));

		// Deermine the substring from the index 2-6 in string two
		System.out
				.println("The substring from positions 2-6 in String two is: "
						+ sTwo.substring(2, 7));

	}
}
