package section_3._2_spiral;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		// Create a new Robot
        Robot rob = new Robot();

		// PEN.   Set your robot's pen down
        rob.penDown();

		// SPEED. Set the robot to go at max speed (100)
        rob.setSpeed(100);

		// COUNT. Create an int variable that will count how many lines of the spiral we have drawn.
		//        Start its value as 0.
        int count = 0;

		// LOOP. Start a while loop to repeat the COLOR, DRAW, TURN, and COUNT 
		//       code below until 50 lines have been drawn
                while (count < 50 ) {
                	                

			// COLOR.   Have the robot set a random pen color
        rob.setPenColor(0, 0, 0);

			// DRAW.    Move the robot (5*count) pixels
			//          "count" is the name of the variable you created earlier
        rob.move(5 * count);

			// TURN.    Turn the robot (360/7) degrees to the right
        rob.turn(360/7);

			// COUNT.   Increase the count of how many lines have been drawn so far ( count+=1 )
    	count +=1;

			// WIDTH.   Change the robot pen width to the current value of the count variable
        rob.setPenWidth(count);


		//  End the while loop here
                }


		// Run the program.
		// VARIATIONS:
		//  * Try changing some of the numbers in the code!
		//  * Ex: What does changing the 360/7 to 360/3 do?

	}
}
