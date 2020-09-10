

/**
 * it's a game that's going to be played
 * @author lefebvre julien
 */
public class RushHourGame {
	
	//TODO (done) rename (naming conventions)

	/**
	 * this is the game board we're gonna play on
	 */
	private Map park;
	/**
	 * 
	 */
	private Player player;
	private InterfacePlayer IntPlayer;

	
	//TODO the game is ready to play if
	// - the player is ready
	// - the map is set up (here consider as Level 1 card, cf. game cards)
	// so u need 2 fields
	// - player -> type Player
	// - park -> type Map
	// both have to be declared above, and initialized below
	/**
	 * Creates a "ready to be played game"
	 * because the map is create
	 */
	public RushHourGame() {
		this.park=new Map(9);
		this.IntPlayer=new InterfacePlayer(this.park);
		this.player=new KeyBoardPlayer();
	}
	

	/**
	 * method that play the game
	 */
	public void play() {
		boolean GameIsOver=this.park.gameIsFinished();
		while(!GameIsOver) {
			System.out.println(this.park.toString());
			GameIsOver=this.park.processToMove(this.IntPlayer.AskMove());
			IntPlayer.getPanel().repaint();
		}
		System.out.println(this.park.toString()+"\nCongratulation you win!!!");
	
	}
		

	/**
	 * this method gives the ways to move on the board
	 */
	public void instruc() {
		System.out.println("here's how to move around on the set according to the direction of the cars");
		System.out.println("(reculer)←|car|car|→(avancer)\n");
		System.out.println("(reculer)\n    ↑\n  |car|\n  |car|\n    ↓\n(avancer)\n");
		
	}

	//TODO (done) useless, remove it
	
}

	
	

