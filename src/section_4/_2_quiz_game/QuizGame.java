package section_4._2_quiz_game;

import javax.swing.*;

public class QuizGame {
	public static void main(String[] args) {
		int score = 0;
		String input = JOptionPane.showInputDialog("What is the world’s longest river called?");
		if(input.equals("The Nile")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null,"wrong, the correct answer is The Nile");
		}
		input = JOptionPane.showInputDialog("Which city hosted the Summer Olympics in 2012?");
		if(input.equals("London")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null,"wrong, the correct answer is London");
		}
		input = JOptionPane.showInputDialog("Where (continent) is the Great Barrier Reef located?");
		if(input.equals("Australia")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null,"wrong, the correct answer is Australia");
		}
		input = JOptionPane.showInputDialog("In Greek Mythology, who is the Queen of the Underworld and wife of Hades?");
		if(input.equals("Persephone")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null,"wrong, the correct answer is Persephone");
		}
		input = JOptionPane.showInputDialog("Which house was Harry Potter almost sorted into??");
		if(input.equals("Slytherin")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null,"wrong, the correct answer is Slytherin");
		}
		JOptionPane.showMessageDialog(null,"Your total score was "+score);
	}
}
