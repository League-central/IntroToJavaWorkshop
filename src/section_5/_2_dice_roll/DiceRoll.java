//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package section_5._2_dice_roll;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DiceRoll implements ActionListener {

	public static void main(String[] args) {
		new DiceRoll().createWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//This method is called when you click the button

		// 1. Instead of 0, make randomChoice equal to a random number between 1 and 6
		int randomChoice = 0;

		// 2. Fix the code below so that it displays the correct image
		if (randomChoice == 0) {
			label.setIcon(oneImg);
		} else if (randomChoice == 0) {
			label.setIcon(twoImg);
		} else if (randomChoice == 0) {
			label.setIcon(threeImg);
		} else if (randomChoice == 0) {
			label.setIcon(fourImg);
		} else if (randomChoice == 0) {
			label.setIcon(fiveImg);
		} else {
			label.setIcon(sixImg);
		}
	}

	public void createWindow() {
		panel.add(rollButton);
		panel.add(label);
		window.add(panel);
		label.setIcon(oneImg);
		panel.setBackground(new Color(172, 93, 201));
		rollButton.addActionListener(this);
		rollButton.setBackground(new Color(224, 190, 237));
		rollButton.setOpaque(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
	}

	private JFrame window = new JFrame("Roll the Dice!");
	private JPanel panel = new JPanel();
	private JButton rollButton = new JButton("CLICK HERE TO ROLL");
	private JLabel label = new JLabel();

	private Icon oneImg = new ImageIcon(getClass().getResource("./img/dice 1.png"));
	private Icon twoImg = new ImageIcon(getClass().getResource("./img/dice 2.png"));
	private Icon threeImg = new ImageIcon(getClass().getResource("./img/dice 3.png"));
	private Icon fourImg = new ImageIcon(getClass().getResource("./img/dice 4.png"));
	private Icon fiveImg = new ImageIcon(getClass().getResource("./img/dice 5.png"));
	private Icon sixImg = new ImageIcon(getClass().getResource("./img/dice 6.png"));


}
