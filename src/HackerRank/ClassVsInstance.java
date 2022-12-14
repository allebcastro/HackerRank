package HackerRank;
import java.io.*;
import java.util.*;

public class ClassVsInstance {
    private int age;	
  
	public ClassVsInstance(int initialAge) {
  		// Add some more code to run some checks on initialAge
		age = initialAge;
		if(age < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			age = 0;
		}
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
		String x = age < 13 ? "You are young." : age >= 13 && age < 18 ? "You are a teenager." : "You are old.";
        System.out.println(x/*Insert correct print statement here*/);
	}

	public void yearPasses() {
  		// Increment this person's age.
		age+=1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassVsInstance p = new ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}