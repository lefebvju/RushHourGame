// TODO (done) rename to RushHourGame
// TODO javadoc!
/**
 * @author lefebvre julien
 */
public class RushHourGame {
	
	/**
	 * creation of a part attribute that represents all the levels
	 */
	private final Level Part= new Level();
	/**
	 * creation of a map of the part
	 */
	private final Map Park =new Map();

	//TODO (done) explain what means "ready to be played game"
	// it will help finding fields (name, type, initial values)
	/**
	 * Creates a "ready to be played game"
	 * because the Level is create and the map is create
	 */
	public RushHourGame() {

	}
	
	// TODO (done) nope, this method creates nothing (constructor did)
	/**
	 * method that play a part
	 */
	public void play() {
		
		// TODO (done) rename Partie1 (naming conventions)
		// TODO (done) level should have already been created
		getPart().playLevel(1);
		getPart().playLevel(2);
		getPart().playLevel(3);
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

	/**
	 * @return a Level
	 */
	public Level getPart() {
		return this.Part;
	}

	/**
	 * @return a Map
	 */
	public Map getPark() {
		return this.Park;
	}

	

}

	
	

