import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.Color;

public class RockPaper extends JFrame implements ActionListener {

   
    private JTextField textField, textField2;

    public static void main(String[] args) {
        RockPaper paper = new RockPaper();
        paper.setSize(420,150); // Setting up the pane
        paper.setLocationRelativeTo(null);
        paper.createGUI();
        paper.show();
    }

    private void createGUI() {
    	 final Color panelcolor = new Color(255,255,204);
    	 final Color combocolor = new Color(255,200,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        JLabel mylabel = new JLabel(" Player");
        window.setBackground(panelcolor);
        window.add(mylabel);
  
        String[] items = { "Rock", "Paper" , "Scissors"};
        JComboBox cb = new JComboBox(items);
        cb.setBackground(combocolor);
        
        cb.setEditable(true);
        cb.addActionListener(this);
        window.add(cb);
       
        JLabel mylabel1 = new JLabel("Computer");
        window.add(mylabel1);
        textField2 = new JTextField(15);
        textField2.setText("Selecting");
        window.add(textField2);
        
        
        textField = new JTextField(15);
        JLabel mylabel2 = new JLabel("Result");
        window.add(mylabel2);
        textField.setText("Result of the Game");
        window.add(textField);

    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        int playerChoice; 
        int compChoice;   
        String winner;
        Random randomSeed = new Random(); 
    	JComboBox cb = (JComboBox) event.getSource();
    	 Object newItem = cb.getSelectedItem();
    	 
    	 
    	 if( newItem == cb.getItemAt(0)) {
    		 playerChoice = 0;
    	 }else if ( newItem == cb.getItemAt(1)) {
    		 playerChoice = 1;
    	 }else {
    		 playerChoice = 2;
    	 }
    	 

        compChoice = randomSeed.nextInt(3); 
        winner = findWinner(playerChoice, compChoice);
      
        textField.setText(winner + "!"); 

        if (compChoice == 0) { 
            textField2.setText(" Rock ");
        } else if (compChoice == 1) {
            textField2.setText(" paper ");
        } else {
            textField2.setText(" scissors ");
        }

    }
    private String findWinner(int playerChoice, int compChoice) {
        String winner;
        if (playerChoice == compChoice) { 
            winner = "No one, it's a tie";
        } else if (playerChoice == 0 && compChoice == 1) {
            winner = "you Lost sorry"; 
        } else if (playerChoice == 1 && compChoice == 2) {
            winner = "you Lost sorry"; 
        } else if (playerChoice == 2 && compChoice == 0) {
            winner = "you Lost sorry"; 
        } else {
            winner = "You won congratulations"; 
        } return winner; 
    }
}