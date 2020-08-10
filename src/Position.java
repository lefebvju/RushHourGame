/**
 * 
 * @author lefeb
 *
 */
public class Position {
	/**
	 * x is the position of the car on the abscissa axis
	 */
	private int x;
	/**
	 * y is the position of the car on the ordinate axis
	 */
	private int y;
	
	/**
	 * @param x  is the position of the car on the abscissa axis
	 * @param y is the position of the car on the ordinate axis
	 */
	public Position(int x,int y) {
		this.setX(x);
		this.setY(y);
	}

	/**
	 * @return the position of the car on the abscissa axis
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * @param x is the position of the car on the abscissa axis
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the position of the car on the ordinate axis
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * @param y is the position of the car on the ordinate axis
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if (getClass() != obj.getClass())
		      return false;
		Position other = (Position) obj;
		if(this.x!=other.x)
			return false;
		if(this.y!=other.y)
			return false;
		return true;
		
	}
	/**
	 * this method advances the position of the vehicle and returns it
	 * @param d it's a direction of the vehicle
	 * @return the new position
	 */
	public Position getAdvancePosition(Direction d) {
			return new Position(this.x+d.getX(),this.y+d.getY());
		
	}
	
	/**
	 * this method moves the position of the vehicle back and returns it.
	 * @param d it's a direction of the vehicle
	 * @return the new position
	 */
	public Position getBackPosition(Direction d) {
			return new Position(this.x-d.getX(),this.y-d.getY());

	}
	public Position copy() {
		Position ret= new Position(this.x,this.y);
		return ret;
		
	}
	
}
