
public class RandomPlayer implements Player{

	@Override
	public Move AskMove() {
		Position pos = new Position((int) (Math.random() * 6 ),(int) (Math.random() * 6 ));
		Travel dep = Travel.randomTravel() ;
		int nb_dep=(int) (Math.random() * 5 )+1;
		Move move=new Move(dep, pos, 1);
		System.out.println(pos.getX()+","+pos.getY());
		return move;
	}

}
