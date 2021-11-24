package section_3._1_robot_square;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {

    public static void main(String[] args) {

        // This code makes a new Robot
        Robot rob = new Robot();

        // PEN.  Put the robot's pen down so it can draw, Use this command:
        /**   rob.penDown();    **/
        rob.penDown();
        
        // SPEED. Make the robot move quickly. Use this command:
        /**     rob.setSpeed(100);    **/
        rob.setSpeed(100);
        
        // COUNT. Create an int variable that will count how many sides of the square we have drawn.
        //        Use this code:
        /**     int count = 0;    **/
        int count = 0;
                
        // DRAW.  Draw a line. Use this command:
        /**     rob.move(40);    **/
        

        // TURN.  Turn 90 degrees. Use this command:
        /**     rob.turn(90);    **/
        

        // INCREASE COUNT. Add one to the number of sides that have now been drawn like this:
        /**     count += 1;    **/
            

        // Run the program. Did the Robot draw a line and turn?


        // LOOP.  Make a while loop and move the DRAW, TURN, and INCREASE COUNT code
        //        so it is between the curly braces like the example below.

             while ( count < 4 ) {
            	 	rob.move(200);
            	 	rob.turn(90);
            	 	count += 1;
               }
         

        // Run the program again. Did your Robot draw a square?

    }
}
