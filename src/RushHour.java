import java.util.Scanner;

/**
 * @author lefebvre julien
 */
public class RushHour {

	/**
	 * constructor without parameter of the class RushHour
	 * this constructor will create a game that can be played with the play method.
	 */
	public RushHour() {
		
	}
	
	/**
	 * method that creates a part
	 */
	public void play() {
		Level Partie1 = new Level();
		Partie1.playLevel(1);
		Partie1.playLevel(2);
		Partie1.playLevel(3);
		System.out.println("Congratulations, you finished the game!!!!");
	}
	/**
	 * this method gives the ways to move on the board
	 */
	public void instruc() {
		System.out.println("here's how to move around on the set according to the direction of the cars");
		System.out.println("(reculer)←|car|car|→(avancer)\n");
		System.out.println("(reculer)\n    ↑\n  |car|\n  |car|\n    ↓\n(avancer)\n");
		
	}
}

	
	

