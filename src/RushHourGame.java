// TODO rename to RushHourGame
// TODO javadoc!
/**
 * @author lefebvre julien
 */
public class RushHourGame {
	
	

	//TODO explain what means "ready to be played game"
	// it will help finding fields (name, type, initial values)
	/**
	 * Creates a "ready to be played game"
	 * because the Level is create
	 */
	public RushHourGame() {

	}
	
	// TODO nope, this method creates nothing (constructor did)
	/**
	 * method that creates a part
	 */
	public void play() {
		
		// TODO rename Partie1 (naming conventions)
		// TODO level should have already been created
		Level Game = new Level();
		Game.playLevel(1);
		Game.playLevel(2);
		Game.playLevel(3);
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

	
	

