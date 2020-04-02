
/**
 * 
 * the vehicle needed in the car park
 *  
 * @author sylvesad
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
	
	
	//TODO do not use char here, declare an enumeration
	/**
	 * dir is a direction of the car in the array which will be either x or y
	 */
	private final char dir;
	
	//TODO u shlud better store color instead of name (+enum)
	/**
	 * name is a type of vehicle followed by color
	 */
	private final String name;
	
	
	//TODO javadoc (finish it)
	/**
	 * constructor with parameter for make car
	 * @param name 
	 * @param x is the position of the car on the abscissa axis
	 * @param y is the position of the car on the ordonate axis
	 * @param dir
	 */
	public Vehicle(String name,int x, int y,char dir)
	{
		this.dir=dir;
		this.setPos(x,y);
		this.size=Vehicle.DEFAULT_SIZE;
		this.name=name;
	}
	
	//TODO javadoc (finish it)
	/**
	 * constructor with parameter for make all vehicle
	 * @param name 
	 * @param x
	 * @param y
	 * @param dir
	 * @param size 
	 */
	public Vehicle(String name,int x, int y,char dir,int size)
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
	 * 
	 * @return direction of the vehicle 
	 */
	public char getDir() {
		return this.dir;
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
	 * @param x
	 * @param y
	 */
	public void setPos(int x,int y) {
		this.pos = new Position(x,y);
	}
}
