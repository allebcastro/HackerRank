package HackerRank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		System.out.println(palindrome(word));
		s.close();
	}
	
	public static String palindrome(String word) {
		String word2 = "";
		for(int i = word.length()-1; i>=0; i--) {
			word2 += word.charAt(i);
		}
		return word2.equalsIgnoreCase(word) ? "\"" + word2 +"\" is a palindrome." : word + " is not a palindrome.";
	}

}
