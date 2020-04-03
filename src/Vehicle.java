
/**
 * 
 * the vehicle needed in the car park
 *  
 * @author lefebvju
 * 
 *
 */

public class Vehicle 
{
	
	//TODO use an enumeration for constants
	/**
	 *  the default size of a truck
	 */
	public final static int TRUCK_SIZE=3;
	/**
	 *  the default size of a normal car
	 */
	public final static int DEFAULT_SIZE=2;
	/**
	 *  the default size of bike
	 */
	public final static int BIKE_SIZE=1;
	
	/**
	 *	the size of the car 
	 */
	private final int size;
	
	//TODO (done) gather x/y in an object (Position)
	/**
	 * it's position in map
	 */
	private Position pos;
	
	
	//TODO (done) do not use char here, declare an enumeration
	/**
	 * dir is a direction of the car in the array which will be either x or y
	 */
	private final Direction dir;
	
	//TODO u shlud better store color instead of name (+enum)
	/**
	 * name is a type of vehicle followed by color
	 */
	private final String name;
	
	
	//TODO (done) javadoc (finish it)
	/**
	 * constructor with parameter for make car
	 * @param name 
	 * @param x is the position of the car on the abscissa axis
	 * @param y is the position of the car on the ordonate axis
	 * @param dir is the direction in the map
	 */
	public Vehicle(String name,int x, int y,Direction dir)
	{
		this.dir=dir;
		this.setPos(x,y);
		this.size=Vehicle.DEFAULT_SIZE;
		this.name=name;
	}
	
	//TODO (done) javadoc (finish it)
	/**
	 * constructor with parameter for make all vehicle
	 * @param name 
	 * @param x is the position of the car on the abscissa axis
	 * @param y is the position of the car on the ordinate axis
	 * @param dir is the direction in the map
	 * @param size is the size of the vehicle
	 */
	public Vehicle(String name,int x, int y,Direction dir,int size)
	{
		this.dir=dir;
		this.setPos(x,y);
		this.size=size;
		this.name=name;
	}
	
	/**
	 * @return the size of vehicle
	 */
	public int getSize() {
		return this.size;
	}
	
	
	/**
	 * @return name of vehicle
	 */
	public String getName() {
		return this.name;
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
}
