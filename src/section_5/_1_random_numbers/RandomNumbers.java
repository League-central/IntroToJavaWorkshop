package section_5._1_random_numbers;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
    	Random randy = new Random();
    	int number = randy.nextInt();
    	System.out.println("Random number is " + number);
    	int numberLessThan100 = randy.nextInt(101);
    	System.out.println("Random number from 0 to 100 is " + numberLessThan100);
    	int low = 100;
    	int high = 110;
    	int randomBetweenLowAndHigh = randy.nextInt((high-low)+1)+low;
    	System.out.println("Random number from 100 to 110 is " + randomBetweenLowAndHigh); 
    }
}
