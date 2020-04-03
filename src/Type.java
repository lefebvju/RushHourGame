/**
 * 
 * @author lefeb
 *
 */
public enum Type {
	/**
	 * truck is a vehicle with size=3
	 */
	truck(3),
	/**
	 * car is a vehicle with size = 2
	 */
	car(2);
	
	/**
	 * is the size of vehicle type
	 */
	private final int size;
	
	/**
	 * @param size of vehicle type
	 */
	Type(int size){
		this.size=size;
	}

	/**
	 * @return the size of vehicle
	 */
	public int getSize() {
		return this.size;
	}
}
