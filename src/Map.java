/**
 * the Car park
 * @author sylvesad
 *	
 */
public class Map {
	/**
	 * 	The default size of map
	 */
	private final static int DEFAULT_SIZE=6;
	/**
	 * 	The table of vehicle 
	 */
	public Vehicle[][] map;
	/**
	 *	
	 */
	public Map()
	{
		this.map= new Vehicle[DEFAULT_SIZE][DEFAULT_SIZE];
		
	}
	

}
