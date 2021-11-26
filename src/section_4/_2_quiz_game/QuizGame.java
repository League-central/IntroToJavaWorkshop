package section_4._2_quiz_game;

import javax.swing.*;

public class QuizGame {
	public static void main(String[] args) {
		int score = 0;
		
		
    	String input = JOptionPane.showInputDialog("What is the world's longest river called?");
    	if(input.equals("Nile")){
    	    JOptionPane.showMessageDialog(null,"Correct!");
    	    score = score + 1;
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "Wrong, it is the Nile!");
    	}
    	
    	
    	String x = JOptionPane.showInputDialog("Which city hosted the Summer Olympics in 2012?");
    	if(x.equals("London")){
    	    JOptionPane.showMessageDialog(null,"Correct!");
    	    score = score + 1;
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "Wrong, it is Lodon, England!");
    	}

    	
    	String y = JOptionPane.showInputDialog("Where is the Great Barrier Reef located?");
    	if(y.equals("Australia")){
    	    JOptionPane.showMessageDialog(null,"Correct!");
    	    score = score + 1;
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "Wrong, it is Australia!");
    	}

    	
    	String z = JOptionPane.showInputDialog("In Greek Mythology, who is the Queen of the Underworld and wife of Hades?");
    	if(z.equals("Persephone")){
    	    JOptionPane.showMessageDialog(null,"Correct!");
    	    score = score + 1;
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "Wrong, it is Persephone!");
    	}
    	
    	
    	System.out.println("Your final score is: " + score);



	}
}
