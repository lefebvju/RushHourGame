import java.util.Random;

import javax.swing.ImageIcon;

/**
 * 
 * @author lefeb
 *
 */
public enum Color {
	/**
	 * 
	 */
	blue(0,"Bleu"),
	/**
	 * 
	 */
	red(1,"Rouge"),
	/**
	 * 
	 */
	yellow(2,"Jaune"),
	/**
	 * 
	 */
	orange(3,"Orange"),
	/**
	 * 
	 */
	purple(4,"Violet"),
	/**
	 * 
	 */
	vert(5,"Vert"),
	/**
	 * 
	 */
	Maron(6,"Marron"),
	/**
	 * 
	 */
	green(7,"Gris"),
	/**
	 * 
	 */
	navy(8,"Navy"),
	/**
	 * 
	 */
	olive(9,"Olive");
	
	/**
	 * 
	 */
	private final int ID;

	/**
	 * it's a part for create URL of the Vehicle
	 */
	private final String img;
	
	
	/**
	 * @param ID
	 */
	Color(int ID,String img){
		this.ID=ID;
		this.img=img;
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
	
	
	/**
	 * return the part of URL
	 */
	public String getImg() {
		return this.img;
	}

}

