/*
 * This is a simple GAME written in Java
 * I used swing for its UI
 * How to Play? Start the program and answer to the 
 * questions. At the end program show a sentence which
 * used all the words you gave it!
 */


import javax.swing.JOptionPane;



public class FillInTheBlank {

	public static void main(String[] args){
		new FillInTheBlank();
		
	}
	
	//default constructor
	public FillInTheBlank(){
		boolean done = false;
		
		while(!done){
			done = true;
			
			String[] ans = new String[11];
			
			JOptionPane.showMessageDialog(null, "Let's make a game",
					"Fill in the Blank", JOptionPane.INFORMATION_MESSAGE);
			//Color
			String[] colors = {
					"Blue",
					"Red",
					"Purple",
					"Yellow",
					"Green"
					
			};
			
			int indexOfColor = JOptionPane.showOptionDialog(null, "What is your fav color?", 
					"Color" , 0, JOptionPane.QUESTION_MESSAGE, null, 
					colors, 0);
			ans[0] = colors[indexOfColor];
			
			//liquid
			ans[1] = JOptionPane.showInputDialog(null, "What is your fav drink? (liquid)");
			
			//plural noun
			ans[2] = JOptionPane.showInputDialog(null, "Bring something people bring with them to school (Plural noun)?");
			
			//adjective
			ans[3] = JOptionPane.showInputDialog(null, "Your best characteristics (Adjective)?");
			
			//present tense verb
			ans[4] = JOptionPane.showInputDialog(null, "What do you do on weekends? (present tense verb)?");
			
			//plural noun
			ans[5] = JOptionPane.showInputDialog(null, "You own multiple of (Plural noun)?");
			//Singular noun
			ans[6] = JOptionPane.showInputDialog(null, "What is most countries has (Singular noun)?");
			
			//adjective
			ans[7] = JOptionPane.showInputDialog(null, "Your girlfriend/boyfriend should be (Adjective)?");
			
			//present tense verb
			ans[8] = JOptionPane.showInputDialog(null, "What do you do usually (Present tense verb)?");
			
			//present tense verb
			ans[9] = JOptionPane.showInputDialog(null, "Poeple do on vacations (present tense verb)?");
			
			//singular noun
			ans[10] = JOptionPane.showInputDialog(null, "Something you like (Singular noun)?");
			
			
			//confirm with user
			//Yes, No, Cancel
			int input = JOptionPane.showConfirmDialog(null, 
					"Are you sure you ready to see the results?");
			
			if(input == 1){
				done = false;
			}
			else if(input == 2){
				System.exit(0);
			}
			else {
				JOptionPane.showMessageDialog(
						null,
						"Each spring, the sky turns "+ans[0]+". Giant drops of "+ans[1]+" fall from the sky. "
						+ "All this "+ans[1]+" helps the \ngrass and the "+ans[2]+" to grow, but it can make things really "+ans[3]+" too. "
						+ "\nSome places get so much "+ans[1]+", that rivers "+ans[4]+" into the streets. Driving \ncan be tricky when this happens, "
						+ "so some people put special "+ ans[5] +" on their cars. And when the "+ans[1]+" is \nfalling, don't forget your "+ans[6]+". Otherwise, "
						+ "your feet might get "+ans[7]+" if you "+ans[8]+" in puddles! \nAfter all the 1 has fallen, the skies begin to "+ans[9]+". "
						+ "If you are lucky, you might see a huge \n"+ans[10]+" stretched across the sky.",
						"Here is the sentences you made :)",
				        JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
	}
}
