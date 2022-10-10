package HackerRank;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int a[] = new int[count];
		
		for(int x = 0; x < count; x++) {
			a[x] = s.nextInt();
		}
		
		for(int i = count-1; i >=0 ; i--) {
			System.out.print(a[i] + " ");
		}
		
		s.close();
	}

}
