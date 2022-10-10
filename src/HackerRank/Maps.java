package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class Maps {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		HashMap<String, Integer> phoneBook = new HashMap<>();
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			phoneBook.put(name, phone);
		}
		
		while(in.hasNext()) {
			String s = in.next();
			if(phoneBook.containsKey(s)) {
				System.out.println(s +"="+phoneBook.get(s));
			}else {
				System.out.println("Not found");
			}
		}
		
		in.close();
		
	}
}
