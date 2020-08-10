import java.util.Random;

/**
 * 
 * @author lefeb
 *
 */
public enum Type {
	/**
	 * truck is a vehicle with size=3
	 */
	truck(3,"Truck"),
	/**
	 * car is a vehicle with size = 2
	 */
	car(2,"Car");
	
	/**
	 * is the size of vehicle type
	 */
	private final int size;
	
	private final String TypeImg;
	/**
	 * @param size of vehicle type
	 */
	Type(int size,String typeImg){
		this.size=size;
		this.TypeImg=typeImg;
	}

	/**
	 * @return the size of vehicle
	 */
	public int getSize() {
		return this.size;
	}
	public static Type randomType() {
	    int pick = new Random().nextInt(Type.values().length);
	    return Type.values()[pick];
	}

	public String getTypeImg() {
		return TypeImg;
	}
}
