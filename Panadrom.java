import java.util.*;

public class Panadrom {
	

	public static boolean isPanandrom(String word) {
		
		if(word.length()==0 || word.length()==1){
			return true;
		}
		if (word.charAt(0) == word.charAt(word.length()-1)) {
			return isPanandrom(word.substring(1, word.length()-1));
		} else {
			 return false;
		}
	}
	public static void main(String arg[]){
		String panandrom1 = "mom";
		System.out.println(isPanandrom(panandrom1));
	}
}

//9.1, 9.2, 9.3, 9.4, 9.6, 9.7, 9.31
