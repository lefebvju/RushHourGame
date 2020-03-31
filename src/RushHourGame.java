// TODO javadoc!
/**
 * @author lefebvre julien
 */
public class RushHourGame {

	//TODO only declare field here, initialize in constructor
	//TODO javadoc (ask what's wrong)
	/**
	 * creation of a part attribute that represents all the levels
	 */
	private final Level Part= new Level();
	
	//TODO only declare field here, initialize in constructor
	//TODO javadoc (ask what's wrong)
	/**
	 * creation of a map of the part
	 */
	private final Map Park =new Map();

	
	//TODO how is the level
	/**
	 * Creates a "ready to be played game"
	 * because the Level is create and the map is create
	 */
	public RushHourGame() {
		//TODO code it
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

	//TODO this method should be private
	/**
	 * @return a Level
	 */
	public Level getPart() {
		return this.Part;
	}

	//TODO this method should be private
	/**
	 * @return a Map
	 */
	public Map getPark() {
		return this.Park;
	}

	

}

	
	

