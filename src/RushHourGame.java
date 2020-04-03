// TODO (done) javadoc!
/**
 * it's a game that's going to be played
 * @author lefebvre julien
 */
public class RushHourGame {

	//TODO (done) only declare field here, initialize in constructor
	//TODO (done) javadoc (ask what's wrong)
	/**
	 * this is the level that will be played
	 */
	private final Level Part;
	
	//TODO (done) only declare field here, initialize in constructor
	//TODO (done) javadoc (ask what's wrong)
	/**
	 * this is the game board we're gonna play on
	 */
	private final Map Park;

	
	//TODO (done) how is the level
	/**
	 * Creates a "ready to be played game"
	 * because the level at which we're going to play is create and the map is create
	 */
	public RushHourGame() {
		this.Park=new Map();
		this.Part=new Level();
		//TODO (done) code it
	}
	

	/**
	 * method that play the game
	 */
	public void play() {
		
		//TODO for now, consider displying current level in console, using toString
		//TODO consider only playing a level here
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

	//TODO (done) this method should be private
	/**
	 * @return a Level
	 */
	private Level getPart() {
		return this.Part;
	}

	//TODO (done) this method should be private
	/**
	 * @return a Map
	 */
	private Map getPark() {
		return this.Park;
	}

	

}

	
	

