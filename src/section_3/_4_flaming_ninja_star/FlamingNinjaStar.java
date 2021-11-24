package section_3._4_flaming_ninja_star;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {

	public static void main(String[] args) {

		int baseSize = 200;
		int flameSize = 130;

		// Make a new robot, and set it's pen down.
		Robot bob = new Robot();
		// Set the robot speed to 100
		bob.setSpeed(10000);
		bob.penDown();
		bob.setPenColor(170,169,1730);
		bob.setPenWidth(2);
		//  COUNT. Make an int variable to count how many times the loop has repeated
		//         Set its start value to 0
		int count = 0;
	       //  LOOP. Start a while loop to repeat all of the code below ONE time
		while(count < 25) {
			   // TURN RIGHT     Turn the robot 1/8 of a circle
			bob.turn(45);
			   // MOVE           Move the robot 64 pixels
			bob.move(64);
			   // TURN LEFT      Turn the robot 40 degrees to the LEFT
			bob.turn(320);
			   // DRAW FLAME     Move the robot the distance in the variable flameSize
			bob.setPenColor(255,0,0);
			bob.move(flameSize);
			   //                Turn the robot 170 degrees
			bob.turn(170);
			   //                Move the robot the distance in the variable flameSize (again)
			bob.move(flameSize);
			   // TURN RIGHT     Turn the robot 64 degrees to the RIGHT
			bob.turn(64);
			bob.setPenColor(170,169,1730);
			   // MOVE           Move the robot the distance in the variable baseSize
			bob.move(baseSize);
			   // INCREASE COUNT. Increase the count by 1
			count += 1;
		}
		//  End the while loop here

		// TEST.  Run the program. Check that your shape is the same as the first picture in the recipe.
		//        This is one arm of the ninja star.

		// COLOR. Change the Robot's pen color so that the flame is a different color to the rest of the star.
		//        Run the program again. Check the second picture in the recipe.

		// LOOP.  When you have one arm looking right, CHANGE your LOOP to repeat 25 times and run the program.
		
		// VARIATIONS:
		// * Try changing some of the numbers in the code!
		// * Ex: Increase the number of times the loop repeats

	}

}


