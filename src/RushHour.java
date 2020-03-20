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
	
		Scanner saisie =new Scanner(System.in);
		Vehicle CarPlay=new Vehicle("moi ",0,2,'x');
		Vehicle carBlue=new Vehicle("car1",4,0,'y');
		Vehicle carRed=new Vehicle("car2",3,3,'x');
		Map Park = new Map();
		Park.addCar(CarPlay);
		Park.addCar(carBlue);
	
		Park.addCar(carRed);
		
		System.out.println(Park.toString());
		
		while(CarPlay.getX()!=4) {
			
			System.out.println("1:advance\n2:back");
			int ent=saisie.nextInt();
			if(ent==1) {
				
				System.out.println("1:moi\n2:car1\n3:car2");
				ent=saisie.nextInt();
				if(ent==1) {
					Park.advance(CarPlay);
				}else if (ent==2) {
					Park.advance(carBlue);
				}else if (ent==3) {
					Park.advance(carRed);}
			}else if(ent==2) {
				System.out.println("1:moi\n2:car1\n3:car2");
				ent=saisie.nextInt();
				if(ent==1) {
					Park.back(CarPlay);
				}else if (ent==2) {
					Park.back(carBlue);
				}else if (ent==3) {
					Park.back(carRed);
			}}
			System.out.println(Park.toString());
		}
		System.out.println("felicitation");
		
	}
	
}

	
	

