package section_5.extra.awesome_or_not;

import java.util.Random;
import java.util.Scanner;

public class AwesomeOrNot {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		// 1. Make a variable that will hold a random number and put a random number into this variable
		int random = rand.nextInt(4);
		// 2. Print out this variable
		System.out.println(random);
		// 3. Get the user to enter something that they think is awesome
		System.out.println("What is something that you think is awesome?");
		String somethingAwesome = input.nextLine();
		// 4. If the random number is 0
		if(random == 0) {
			System.out.println("wow that's awesome!");
		}
		// -- tell the user whatever they entered is awesome!
		else if(random == 1) {
			System.out.println("wow that's ok!");
		}
		// 5. If the random number is 1
	
		// -- tell the user whatever they entered is ok.
		else if(random == 2) {
			System.out.println("what that is totally boring!");
		}
		// 6. If the random number is 2
	
		// -- tell the user whatever they entered is boring.
	
		// 7. If the random number is 3
		else {
			System.out.println("get out");
		}
		// -- write your own answer
		
	}
}


