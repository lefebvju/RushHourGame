
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
	
	//TODO gather x/y in an object (Position)
	/**
	 * x is the position of the car on the abscissa axis
	 */
	private int x;
	/**
	 * y is the position of the car on the ordinate axis
	 */
	private int y;
	
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
	 * @param x
	 * @param y
	 * @param dir
	 */
	public Vehicle(String name,int x, int y,char dir)
	{
		this.dir=dir;
		this.x=x;
		this.y=y;
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
		this.x=x;
		this.y=y;
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
	 * @return the position of the car on the abscissa axis
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * modification of attribute x
	 * @param x
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
	 * modification of attribute y
	 * @param y 
	 */
	public void setY(int y) {
		this.y = y;
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
}
