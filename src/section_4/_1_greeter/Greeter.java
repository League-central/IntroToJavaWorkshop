package section_4._1_greeter;

import javax.swing.*;

public class Greeter {
    public static void main(String[] args) {
    	System.out.println("Hello World");
    	String input = JOptionPane.showInputDialog("What is your name?");
    	JOptionPane.showMessageDialog(null,"Hello "+input);
    	
    	if(input.equals("Matt")){
    	    JOptionPane.showMessageDialog(null,"You are the coolest person ever!");
    	}
    	else{
    	    JOptionPane.showMessageDialog(null,"I hope you have a nice day :)");
    	}



    }
}
