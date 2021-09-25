package section_4._3_scary_maze;

import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {


	/***********  SOUND ***************
	 * Some computers are unable to play sounds.
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher
	 * *****************/
	boolean canPlaySounds = true;

	boolean started = false;
	BufferedImage maze;
	final int frameWidth = 500;
	final int frameHeight = 500;

	ScaryMaze() throws Exception {

		//1. Choose a maze image from the "img" folder 
		//   OR
		//   Use this online tool (https://www.pixilart.com/) to make a maze image. Size = 500x500
		//   The maze must be drawn using 4 different colors, one each for: START, END, BACKGROUND, and path.
		//   Download your maze image to the computer.
		//   Drag and drop it into the "img" folder

		
		//2. Change the fileName variable below so that it uses YOUR maze's file name
		String fileName = "standardMaze1.png";
		
		maze = ImageIO.read(getClass().getResource("img/"+fileName));

		//3. Run the program. Do you see your maze? Don't continue until you do.


		// Leave this code here!
		addMouseMotionListener(this);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);

		//4. Print the mouseColor variable

		//5.  Run your program and move your mouse over the START COLOR.


		int startColor=0;
		//6. Change the value of this startColor variable to the number printed in the previous step.


		// Leave this code here!
		if (!started  && mouseColor==startColor) {
			started = true;
		}


		//7. Make a new int variable for the background color of the maze


		//8. Run the program and move the mouse over the BACKGROUND COLOR.
		
		//   Set the background variable from Step 7 to the number printed out.




		if (started) {


			//9. If the mouse falls off the path (which means it is on the background color)
			//		Call the scare method - scare();

			//13.  If the mouse is on the end color, pop up a message to tell them they won!
			



		}
	}

	private void scare() {

		//Scare your player with scary messages, sounds and pictures

		System.out.println("BOO!");

		if (canPlaySounds) {

			/**********  PLAY A SOUND ***************/
			//10. Choose the "standardScarySound.wav" from the "img" folder 
			//    OR
			//    Find a scary sound and put it in the "sound" folder.
			//    You can find a sound on freesound.org. Log in as leagueofamazing/code4life.
			
			//11. Play the scary sound. Hint: use the playScarySound method with the name of your sound file


		}
		/**********  SHOW A PICTURE ***************/

		//12. Choose the "standardScaryPicture.jpg" image from the "img" folder 
		//    OR
		//    Find a scary image and drop it into the "img" folder.

		//    Use the showScaryImage method below with the name of your picture file.


	}



	/**********  DO NOT CHANGE THE CODE BELOW THIS LINE ***************/

	private void playScarySound(String soundName) {

		File sound = new File("src/section_4/_3_scary_maze/sound/"+soundName);

		if (sound.exists()) {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}
 		}
		else {
			System.out.println("File does not exist");
		}
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource("img/"+imageName));
		} catch (Exception e) {
			System.err.println("Could not find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);

	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}
