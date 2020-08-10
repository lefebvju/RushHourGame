import java.util.Random;

/**
 * @author lefeb
 *
 */
public enum Direction {
/**
 * it's the abscissa axis
 */
horizontal(1,0,"horizontal"),
/**
 * it's the ordinate axis
 */
vertical(0,1,"vertical");
	/**
	 * the deplacement of x for the Direction
	 */
	private final int x;
	/**
	 * the deplacement of y for the Direction
	 */
	private final int y;
	
	private final String DirImg;
	
	/**
	 * @param x the move for Direction
	 * @param y the move for Direction
	 */
	Direction(int x,int y,String dirImg){
		this.x=x;
		this.y=y;
		this.DirImg=dirImg;
	}

	/**
	 * @return the deplacement of x for the Direction
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * @return the deplacement of y for the Direction
	 */
	public int getY() {
		return this.y;
	}
	public static Direction randomDirection() {
	    int pick = new Random().nextInt(Direction.values().length);
	    return Direction.values()[pick];
	}

	public String getDirImg() {
		return DirImg;
	}
}
