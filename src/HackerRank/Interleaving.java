package HackerRank;

import java.util.Scanner;

public class Interleaving {

	public static void main(String[] args) {
		String word1 = "", word2 = "", word3 = "";
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter first word: ");
//		word1 = s.nextLine();
//		System.out.println("Enter second word: ");
//		word2 = s.nextLine();
//		System.out.println("Enter third word: ");
//		word3 = s.nextLine();
//		s.close();
		System.out.println(isInterleave("CB","A","ABC"));
		
	}

	public static String interleaving(String word1, String word2, String word3) {

		return word1.contains(word2) && word1.contains(word3) ? word1 + " is interleaving of " + word2 + " and " + word3
				: "Words are not interleaving";
	}

	public static boolean isInterleave(String s1, String s2, String s3) {
		if (s3.length() != s1.length() + s2.length()) {
			return false;
		}
		
		boolean dp[][] = new boolean[s1.length() + 1][s2.length() + 1];
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = true;
				} else if (i == 0) {
					dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);
				} else if (j == 0) {
					dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
				} else {
					dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
							|| (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
				}
			}
		}
		return dp[s1.length()][s2.length()];
	}

}
