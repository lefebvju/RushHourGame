import java.util.Random;

/**
 * 
 * @author lefeb
 *
 */
public enum Color {
	/**
	 * 
	 */
	blue(0),
	/**
	 * 
	 */
	red(1),
	/**
	 * 
	 */
	yellow(2),
	/**
	 * 
	 */
	orange(3),
	/**
	 * 
	 */
	purple(4),
	/**
	 * 
	 */
	pink(5),
	/**
	 * 
	 */
	lime(6),
	/**
	 * 
	 */
	aqua(7),
	/**
	 * 
	 */
	navy(8),
	/**
	 * 
	 */
	olive(9);
	
	/**
	 * 
	 */
	private final int ID;
	
	/**
	 * @param ID
	 */
	Color(int ID){
		this.ID=ID;
	}

	/**
	 * @return identifiant
	 */
	public int getID() {
		return this.ID;
	}
	public static Color randomColor() {
	    int pick = new Random().nextInt(Color.values().length);
	    return Color.values()[pick];
	}
}

