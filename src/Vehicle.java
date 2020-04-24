/**
 * the vehicle needed in the car park
 *  
 * @author lefebvju
 */

public class Vehicle 
{
	
		
	/**
	 *	the type of the vehicle 
	 */
	private final Type t_vehicle;
	
	/**
	 * It's the position of the back of the car in map.
	 */
	private Position pos;
	
	
	/**
	 * dir is a direction of the car in the array which will be either x or y
	 */
	private final Direction dir;
	
	/**
	 * it's a color of car
	 */
	private final Color color;
	
	
	//TODO (done) gather x/y in a single Position object
	/**
	 * constructor with parameter for make car
	 * @param color of vehicle 
	 * @param pos It's the position of the back of the car.
	 * @param dir is the direction in the map
	 */
	public Vehicle(Color color,Position pos,Direction dir)
	{
		this.dir=dir;
		this.pos=pos;
		this.t_vehicle=Type.car;
		this.color=color;
	}
	
	//TODO (done) gather x/y in a single Position object
	/**
	 * constructor with parameter for make all vehicle
	 * @param color of vehicle 
	 * @param pos It's the position of the back of the car.
	 * @param dir is the direction in the map
	 * @param theVehicle is a type of the vehicle
	 */
	public Vehicle(Color color,Position pos,Direction dir,Type theVehicle)
	{
		this.dir=dir;
		this.pos=pos;
		this.t_vehicle=theVehicle;
		this.color=color;
	}

	/**
	 * @return position in map
	 */
	public Position getPos() {
		return this.pos;
	}

	/**
	 * @param x is the position of the car on the abscissa axis
	 * @param y is the position of the car on the ordinate axis
	 */
	public void setPos(int x,int y) {
		this.pos = new Position(x,y);
	}
/**
 * 
 * @return direction of the vehicle
 */
	public Direction getDir() {
		return this.dir;
	}

/**
 * @return the type of the vehicle
 */
public Type getT_vehicle() {
	return this.t_vehicle;
}
/**
 * 
 * @return color of vehicle
 */
public Color getColor() {
	return this.color;
}

/**
 * this forward function
 */
public void advance() {
	if (this.getDir()==Direction.horizontal)
		this.getPos().setX(this.getPos().getX()+1);
	else if (this.getDir()==Direction.vertical)
		this.getPos().setY(this.getPos().getY()+1);
}

/**
 * this step back function 
 */
public void back() {
	if (this.getDir()==Direction.horizontal)
		this.getPos().setX(this.getPos().getX()-1);
	else if (this.getDir()==Direction.vertical)
		this.getPos().setY(this.getPos().getY()-1);
}

/**
 * 
 * @param pos is the position compared
 * @return true if the position is different
 */
public boolean equalsPos(Position pos) {
	if(this.dir==Direction.horizontal) {
		for(int posi=0;posi<this.getT_vehicle().getSize();posi++)
			if(pos.getX()==this.getPos().getX()+posi&&pos.getY()==this.getPos().getY()) {
				return false;
			}
	}else{
		for(int posi=0;posi<this.getT_vehicle().getSize();posi++)
			if(pos.getX()==this.getPos().getX()&&pos.getY()==this.getPos().getY()+posi) {
				return false;
			}
	}
	return true;
}

}

