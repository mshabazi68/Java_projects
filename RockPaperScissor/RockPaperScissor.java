import java.util.Random;

public class RockPaperScissor {
	static String[] myList = { "rock", "paper", "scissor" };

	public String winner(String s1, String s2) {
		if ( (s1 == "rock" && s2 == "scissor") ||( s1 == "paper" && s2 == "rock" ) ||( s1 == "scissor" && s2 == "paper") ){
			return "First_player won the game";
		}else if ( s1 == s2) {
			return "It's a Drwa";
		}else if ( (s2 == "rock" && s1 == "scissor") ||( s2 == "paper" && s1 == "rock" ) ||( s2 == "scissor" && s1 == "paper") ) {
			return "Second_player won the game";
		}else
			return "";

		}

	public static void main(String[] args) {
		Random rand = new Random();
		int rand1 = rand.nextInt(3);
		int rand2 = rand.nextInt(3);
		System.out.println("First player: " + myList[rand1]);
		System.out.println("second player: " + myList[rand2]);

		RockPaperScissor obj = new RockPaperScissor();
		System.out.println(
		obj.winner(myList[rand1], myList[rand2]));

	}

}
