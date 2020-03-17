
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
	/**
	 * x is the position of the car on the abscissa axis
	 */
	private int x;
	/**
	 * y is the position of the car on the ordinate axis
	 */
	private int y;
	/**
	 * dir is a direction of the car in the array which will be either x or y
	 */
	private final char dir;
	/**
	 * name is a type of vehicle followed by color
	 */
	private final String name;
	
	/**
	 *  the constructor without parameter = create an normal car 
	 */
	public Vehicle()
	{
		this.size=Vehicle.DEFAULT_SIZE;
	}
	/**
	 *	the constructor with an size parameter
	 * @param s = Size of the vehicle that you want
	 */
	public Vehicle(int s)
	{
		this.size=s;
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
