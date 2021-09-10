/*
 * 
 * 
 * RUN THE PROGRAM AND HAVE FUN DRAWING!!!
 *
 *
 */

package section_3.extra.robot_draw;

import java.awt.Color;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotDraw implements KeyEventDispatcher {

	Robot rob;
	boolean canDraw=false;
	boolean canErase=false;
	int width = 1;
	int keyPressed = 0;
	int turn = 0;
	Color color = Color.BLACK;
	
	public void moveRobot(int keyPressed) throws InterruptedException {
		//Can move and turn the robot using UP,LEFT,& RIGHT Keys
		if(keyPressed==KeyEvent.VK_UP) {
			rob.move(10);
		}
		if(keyPressed==KeyEvent.VK_LEFT) {
			turn-=45;
			rob.setAngle(turn);
		}
		if(keyPressed==KeyEvent.VK_RIGHT) {
			turn+=45;
			rob.setAngle(turn);
		}
	}
	
	private void setCanErase(int keyPressed) throws InterruptedException {
		// If U is pressed, toggle canErase
		if (keyPressed==KeyEvent.VK_U) {
			canErase=!canErase;
		}
	}
	
	private void setCanDraw(int keyPressed) throws InterruptedException {
		// If space is pressed, toggle canDraw
		if(keyPressed==KeyEvent.VK_SPACE) {
			canDraw=!canDraw;
		}
	}
	
	private void setColor(int keyPressed) throws InterruptedException {
		// If 0-9 Keys are pressed, choose that color
		switch(keyPressed) {
		case KeyEvent.VK_0:
			color=Color.BLACK;
			break;
		case KeyEvent.VK_1:
			color=Color.BLUE;
			break;
		case KeyEvent.VK_2:
			color=Color.RED;
			break;
		case KeyEvent.VK_3:
			color=Color.GREEN;
			break;
		case KeyEvent.VK_4:
			color=Color.YELLOW;
			break;
		case KeyEvent.VK_5:
			color=Color.MAGENTA;
			break;
		case KeyEvent.VK_6:
			color=Color.ORANGE;
			break;
		case KeyEvent.VK_7:
			color=Color.PINK;
			break;
		case KeyEvent.VK_8:
			color=Color.CYAN;
			break;
		case KeyEvent.VK_9:
			color=Color.WHITE;
			break;
		}
		rob.setPenColor(color);
	}
	
	private void setWidth(int keyPressed) throws InterruptedException {
		// If w is pressed, the width is set
		String ans="";
		if(keyPressed==KeyEvent.VK_W) {
			ans = JOptionPane.showInputDialog("How wide do you want the pen to be? (Enter a number)");
			width = Integer.parseInt(ans);
		}
		rob.setPenWidth(width);
	}
	
	public static void main(String[] args) {
		new RobotDraw().controlTheRobot();
		
	}

	private void controlTheRobot() {
		String[] robots = {"batman", "regular", "mini"};
		int robotChoice = JOptionPane.showOptionDialog(null, "Choose your robot", "Choose Robot", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, robots, null);
		if(robotChoice == 0) {
			rob = new Robot("batman");
		}
		else if(robotChoice == 1) {
			rob = new Robot();
		}
		else {
			rob = new Robot("mini");
		}

		System.out.println( "Directions:\n\n"
				+ "UP key to move\n"
				+ "LEFT and RIGHT keys to turn\n"
				+ "SPACE to draw line\n"
				+ "U to erase\n"
				+ "0-9 to change different colors\n"
				+ "W to change pen width");

		JOptionPane.showMessageDialog(null, "UP key to move\n"
											+ "LEFT and RIGHT keys to turn\n"
											+ "SPACE to draw line\n"
											+ "U to erase\n"
											+ "0-9 to change different colors\n"
											+ "W to change pen width\n\n"
											+ "*DIRECTIONS ARE ALSO PRINTED IN THE CONSOLE*",
											"Directions:", JOptionPane.INFORMATION_MESSAGE);
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		rob.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			try {
				//Allows robot to draw w/ penDown
				setCanDraw(e.getKeyCode());
				if(canDraw) {
					rob.penDown();
				}
				else {
					rob.penUp();
				}
				
				//Allows robot to erase
				setCanErase(e.getKeyCode());
				if(canErase) {
					rob.setPenColor(220,220,220);
					rob.setPenWidth(10);
					rob.penDown();
				}
				else {
					//sets the robot's penWidth and penColor
					setWidth(e.getKeyCode());
					setColor(e.getKeyCode());
				}
				
				//Move the robot
				moveRobot(e.getKeyCode());
			} 
			catch (InterruptedException e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}
}
