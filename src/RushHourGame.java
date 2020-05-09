

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
		this.park=new Map();
		this.player=new Player();
	}
	

	/**
	 * method that play the game
	 */
	public void play() {
		boolean GameIsOver=false;
		while(!GameIsOver) {
			System.out.println(this.park.toString());
			this.park.processToMove(this.player.AskMove());
			
		}
		
	
		
		
/*
		//TODO (done) directly access field here
		Scanner saisie =new Scanner(System.in);
		Position p_CarPlay = new Position(0,2);
		Vehicle CarPlay=new Vehicle(Color.lime,p_CarPlay,Direction.horizontal);
		Position p_CarBlue = new Position(3,0);
		Vehicle carBlue=new Vehicle(Color.blue,p_CarBlue,Direction.vertical,Type.truck);
		Position p_CarRed = new Position(3,3);
		Vehicle carRed=new Vehicle(Color.navy,p_CarRed,Direction.horizontal);
		
		this.park.addCar(CarPlay);
		this.park.addCar(carBlue);
	
		this.park.addCar(carRed);
		
		System.out.println(this.park.toString());
		
		while(CarPlay.getPos().getX()!=4) {
			
			System.out.println("1:advance\n2:back");
			int ent=saisie.nextInt();
			if(ent==1) {
				
				System.out.println("1:moi\n2:car1\n3:car2");
				ent=saisie.nextInt();
				if(ent==1) {
					this.park.advance(CarPlay);
				}else if (ent==2) {
					this.park.advance(carBlue);
				}else if (ent==3) {
					this.park.advance(carRed);}
			}else if(ent==2) {
				System.out.println("1:moi\n2:car1\n3:car2");
				ent=saisie.nextInt();
				if(ent==1) {
					this.park.back(CarPlay);
				}else if (ent==2) {
					this.park.back(carBlue);
				}else if (ent==3) {
					this.park.back(carRed);
			}}
			System.out.println(this.park.toString());
		}
		System.out.println("Congratulations!!!");
		System.out.println("Congratulations, you finished the game!!!!");
	*/}
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

	
	

