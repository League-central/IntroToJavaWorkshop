package section_3._3_pentagon_crazy;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, maybe draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {
	public static void main(String[] args) {

		// Create a new Robot
		Robot rob = new Robot();
		// Put the robot's pen down
		rob.penDown();
		// SPEED. Make the robot go at maximum speed (100)
		rob.setSpeed(100);
		// COLOR. Set the pen to a color that you like for the shape

		// NUMBER OF SIDES. Make an int variable for the number of sides the shape will have.
		int sides = 5;
		// TURN ANGLE. Make another int variable for the angle the robot must turn.
		//             Hint: Divide 360 by the number of sides
		int angle = 360/sides;
		// COUNT. Make another int variable to count how many times the loop has repeated
		//        Set its start value to 0
		int loop = 0;
		// LOOP. Start a while loop to repeat the DRAW, TURN, and INCREASE COUNT code 5 times.
		rob.hide();
		while (loop < 200 ) {
			// DRAW. Make the robot move "100" pixels
			rob.move(loop);
			rob.setRandomPenColor();
			// TURN. Turn the robot the amount in your angle variable
			rob.turn(angle + 3);
			// INCREASE COUNT. Increase the loop count by 1
			loop +=1;
			// End the while loop here
		}
		// Now hide the robot so you can see the pattern it has drawn.

		// Run the program.
		// Did it make a pentagon? Good! Now time to make it spiral.
		
		// SPIRAL. Change your LOOP to repeat 200 times instead of 5
		// 		   Change the DRAW to move "count" pixels instead of 100
		//         "count" is the variable in your while loop
		
		// Run the program.
		// Did it make a spiral pentagon? Awesome! Let's make it crazy now!
		
		// CRAZY. Change your TURN to be the amount in your angle variable + 1
		
		// Run the program.
		// Do you have a crazy pentagon? Nice job!
		
		// VARIATIONS:
		// * make the pattern really huge
		// * randomize the color of the pattern
		// * change the turn amount
		// * experiment with different shapes

	}
}
