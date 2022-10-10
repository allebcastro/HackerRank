package HackerRank;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		for(int x = 0; x<count; x++) {
			String s = scan.next();
			
			for(int i = 0; i < s.length(); i+=2) {
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
			for(int y = 1; y<s.length(); y+=2) {
				System.out.print(s.charAt(y));
			}
			System.out.println();
			
		}
		
		scan.close();
	}
}
