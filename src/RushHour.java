import java.util.Scanner;

/**
 * @author lefebvre julien
 */
public class RushHour {

	/**
	 * constructor without parameter of the class RushHour
	 * this constructor will create a game that can be played with the play method.
	 */
	public RushHour() {
		
	}
	
	/**
	 * method that creates a part
	 */
	public void play() {
	
		Vehicle CarPlay=new Vehicle("moi ",0,2,'x');
		
		Map Park = new Map();
		Park.addCar(CarPlay);
		System.out.println(Park.toString());
		
		
	}

	
	
}
