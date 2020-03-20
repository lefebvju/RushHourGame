import java.util.Scanner;

/**
 * @author lefebvre julien
 */
public class RushHour {

	/**
	 * constructor without parameter of the class RushHour
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
