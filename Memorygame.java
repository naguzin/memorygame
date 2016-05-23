package memorygame;
import java.util.Arrays;

public class Memorygame {

	public static void main(String[] args) 
	{
		Board newBoard = new Board();
		newBoard.size(); //creates size of board
		newBoard.assign(); //assigns numbers to the board
		gamelogic newrun = new gamelogic();
		newrun.game();//runs the game
		
	}
}

