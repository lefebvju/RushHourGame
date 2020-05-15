import java.util.Scanner;

public class Player {

	public Player() {
		
	}

	public Move AskMove() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Entrez numéro de vehicule:");
		int num = sc.nextInt();
		System.out.println("");
		int y=0;
		int x=0;
		Travel dep=Travel.back;
		Position pos=new Position(x,y);
		int nb_dep=0;
		Move move=new Move(dep,pos,nb_dep);
		
		return move;
	}
}
