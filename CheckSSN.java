import java.util.*;
public class CheckSSN {
	public static boolean isDigit(char number){
		boolean digit;
		if(isDigit(number)){
			digit = true;
		}
		else{
			digit = false;
		}
		return digit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String SSn = input.nextLine();
		for(int x = 0; x<SSn.length();x++ ){
			if (isDigit(SSn.charAt(x)) == false){
				
			};
		}
		
	}

}
