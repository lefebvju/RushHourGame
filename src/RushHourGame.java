
/**
 * it's a game that's going to be played
 * @author lefebvre julien
 */
public class RushHourGame {

	//TODO rename (naming conventions)
	/**
	 * this is the level that will be played
	 */
	private final Level Part;
	
	//TODO rename (naming conventions)

	/**
	 * this is the game board we're gonna play on
	 */
	private final Map Park;

	
	//TODO how is the level? (not done)
	/**
	 * Creates a "ready to be played game"
	 * because the level at which we're going to play is create and the map is create
	 */
	public RushHourGame() {
		this.Park=new Map();
		this.Part=new Level();
	}
	

	/**
	 * method that play the game
	 */
	public void play() {
		
		//TODO directly access field here
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

	//TODO useless, remove it
	/**
	 * @return a Level
	 */
	private Level getPart() {
		return this.Part;
	}

	//TODO useless, remove it
	/**
	 * @return a Map
	 */
	private Map getPark() {
		return this.Park;
	}
}

	
	

