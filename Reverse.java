import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner (System.in);
		int number [] = new int [10];
		System.out.println("Please enter a 10 digit number ");
		for (int x = 0 ; x < 10; x++){
			number [x] = user_input.nextInt();
		}
		for (int y = 1; y <= 10 ; y ++){
			System.out.print(number[number.length - y] + " ");
		}
	}

}
