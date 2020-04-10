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
}
