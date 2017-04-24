import java.util.*;

public class SwapCase {
	public static String LowtoUp(String letter) {
		if (letter.toLowerCase() == letter) {
			letter = letter.toUpperCase();
		} else {
			letter = letter.toLowerCase();
		}
		return letter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = input.nextLine();
		String newWord = "";
		for (int x = 0; x < word.length(); x++) {
			newWord += LowtoUp(String.valueOf(word.charAt(x)));
		}
		System.out.println(newWord);
	}

}
