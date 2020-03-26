// TODO rename to RushHourGame
// TODO javadoc!
/**
 * @author lefebvre julien
 */
public class RushHour {

	//TODO explain what means "ready to be played game"
	// it will help finding fields (name, type, initial values)
	/**
	 * Creates a "ready to be played game"
	 */
	public RushHour() {
		
	}
	
	// TODO nope, this method creates nothing (constructor did)
	/**
	 * method that creates a part
	 */
	public void play() {
		
		// TODO rename Partie1 (naming conventions)
		// TODO level should have already been created
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

	
	

