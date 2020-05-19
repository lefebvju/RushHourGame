import java.util.Scanner;

/**
 * @author lefebvju
 *
 */
public class KeyBoardPlayer implements Player{

	/**
	 * it's a constructor of KeyBoardPlayer
	 */
	public KeyBoardPlayer() {
		
	}

	public Move AskMove(Map park) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Entrez numéro de vehicule:");
		int num = sc.nextInt();
		Position pos = null;
		for(Vehicle leVehicle: park.map) {
			if(leVehicle.getColor().getID()==num) {
				pos=leVehicle.getPos();
			}
		}
		System.out.println("entrez 1 pour avancer et 2 pour reculer");
		int num_dep = sc.nextInt();
		Travel dep = null;
		if(num_dep==1) {
			dep=Travel.forth;
		}
		else if (num_dep==2) {
			dep=Travel.back;
		}
		System.out.println("entrez le nombre de case dont vous voulez avancer");
		int nb_dep = sc.nextInt();
		Move move=new Move(dep, pos, nb_dep);
		return move;
	}
}
