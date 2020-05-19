
/**
 * @author lefeb
 *
 */
public enum Direction {
/**
 * it's the abscissa axis
 */
horizontal(1,0),
/**
 * it's the ordinate axis
 */
vertical(0,1);
	/**
	 * the deplacement of x for the Direction
	 */
	private final int x;
	/**
	 * the deplacement of y for the Direction
	 */
	private final int y;
	
	/**
	 * @param x the move for Direction
	 * @param y the move for Direction
	 */
	Direction(int x,int y){
		this.x=x;
		this.y=y;
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
}
