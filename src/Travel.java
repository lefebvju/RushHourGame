import java.util.Random;

/**
 * travel is an enumeration for direction of travel
 * @author lefeb
 *
 */
public enum Travel {
	/**
	 * it's going forward
	 */
	forth,
	/**
	 * it's going backward
	 */
	back;
	

public static Travel randomTravel() {
    int pick = new Random().nextInt(Travel.values().length);
    return Travel.values()[pick];
}}