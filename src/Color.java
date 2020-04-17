/**
 * 
 * @author lefeb
 *
 */
public enum Color {
	/**
	 * 
	 */
	blue(1),
	/**
	 * 
	 */
	red(2),
	/**
	 * 
	 */
	yellow(3),
	/**
	 * 
	 */
	orange(4),
	/**
	 * 
	 */
	purple(5),
	/**
	 * 
	 */
	pink(6),
	/**
	 * 
	 */
	lime(7),
	/**
	 * 
	 */
	aqua(8),
	/**
	 * 
	 */
	navy(9),
	/**
	 * 
	 */
	olive(10);
	
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
}

