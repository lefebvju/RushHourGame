
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
	public final static int TRUCK=3;
	/**
	 *  the default size of a normal car
	 */
	public final static int DEFAULTSIZE=2;
	/**
	 *  the default size of bike
	 */
	public final static int BIKE=1;
	
	/**
	 *	the size of the car 
	 */
	private final int size;
	
	/**
	 *  the constructor without parameter = create an normal car 
	 */
	public Vehicle()
	{
		this.size=Vehicle.DEFAULTSIZE;
	}
	/**
	 *	the constructor with an size parameter
	 * @param s = Size of the vehicle that you want
	 */
	public Vehicle(int s)
	{
		this.size=s;
	}
	
	
	
	
}
