package section_3._3_pentagon_crazy;

/* Teacher’s note: before beginning, maybe draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

import org.jointheleague.graphical.robot.Robot;
public class PentagonCrazy {
	public static void main(String[] args) {

		// Create a new Robot
		Robot bob = new Robot();
		bob.hide();
		// Put the robot's pen down
		bob.penDown();
		// SPEED. Make the robot go at maximum speed (100)
		bob.setSpeed(100);
		// COLOR. Set the pen to a color that you like for the shape
		bob.setPenColor(255, 192, 203);
		bob.setPenWidth(2);
		// NUMBER OF SIDES. Make an int variable for the number of sides the shape will have.
		int side = 5;
		// TURN ANGLE. Make another int variable for the angle the robot must turn.
		//             Hint: Divide 360 by the number of sides
		int angle = 360/side;
		
		// COUNT. Make another int variable to count how many times the loop has repeated
		//        Set its start value to 0
		int count = 0;
		
		// LOOP. Start a while loop to repeat the DRAW, TURN, and INCREASE COUNT code 5 times.
		while (count < 200) {
			// DRAW. Make the robot move "100" pixels
			bob.move(count);
			// TURN. Turn the robot the amount in your angle variable
			bob.turn(angle + 1);
			// INCREASE COUNT. Increase the loop count by 1
			count += 1;
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
