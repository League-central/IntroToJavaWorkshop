//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package section_5._3_rock_paper_scissors;

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

public class RockPaperScissors extends JPanel implements ActionListener {

    //If you don't like these images, you can add "2" to the end of each for different ones (e.g. "./img/rock2.png")
    private final String rockImageUrl = "./img/rock.png";
    private final String paperImageUrl = "./img/paper.png";
    private final String scissorsImageUrl = "./img/scissors.png";

    public static void main(String[] args) {
        new RockPaperScissors().createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //1. Run the program and click an image to make a choice. Notice that the computer always makes the same choice.

        //2. Change the value of opponentSelection to be a random number between 0 and 2;
        //   Don't forget to create a Random object.

        int opponentSelection = 0;

        //3. Run the program again. Is the result different?

        int selection = 0;

        if (e.getSource() == paperButton) {
            selection = 1;
        } else if (e.getSource() == scissorsButton) {
            selection = 2;
        }

        JOptionPane.showMessageDialog(null, "You chose: " + convertSelection(selection) + ".\n"
                + "The computer chose: " + convertSelection(opponentSelection) + ".\n");

        if (selection == opponentSelection) {
            JOptionPane.showMessageDialog(null, "No Winner.  Play again.");
        } else if ((selection == 0 && opponentSelection == 2) ||
                (selection == 1 && opponentSelection == 0) ||
                (selection == 2 && opponentSelection == 1)) {
            JOptionPane.showMessageDialog(null, "You Win!");
        } else {
            JOptionPane.showMessageDialog(null, "You Lose!");
        }
    }

    private String convertSelection(int s) {
        if (s == 0)
            return "ROCK";
        else if (s == 1)
            return "PAPER";
        else if (s == 2)
            return "SCISSORS";
        else
            return "";
    }

    public void createWindow() {
        rockButton.setIcon(new ImageIcon(rockImage));
        paperButton.setIcon(new ImageIcon(paperImage));
        scissorsButton.setIcon(new ImageIcon(scissorsImage));

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);

        rockButton.setPreferredSize(buttonDim);
        paperButton.setPreferredSize(buttonDim);
        scissorsButton.setPreferredSize(buttonDim);
        setBackground(new Color(80, 134, 138));
        instructionLabel.setText("Choose Your Weapon!");

        add(instructionLabel);
        add(rockButton);
        add(paperButton);
        add(scissorsButton);

        window.add(this);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
    }

    private JFrame window = new JFrame("Rock, Paper, Scissors");
    private JButton rockButton = new JButton();
    private JButton paperButton = new JButton();
    private JButton scissorsButton = new JButton();

    private JLabel instructionLabel = new JLabel();

    private Image rockImage = new ImageIcon(getClass().getResource(rockImageUrl)).getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
    private Image paperImage = new ImageIcon(getClass().getResource(paperImageUrl)).getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT);
    private Image scissorsImage = new ImageIcon(getClass().getResource(scissorsImageUrl)).getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);

    private Dimension buttonDim = new Dimension(300, 200);

}
