
/**
 * it's a class of 
 * @author lefeb
 *
 */
public class Move {
	
/**
 * 
 */
private final Direction dir;
/**
 * 
 */
private final Position pos;
/**
 * 
 */
private final int nb_Dep;

/**
 * @param dir
 * @param pos
 * @param nb_Dep
 */
public Move(Direction dir,Position pos,int nb_Dep) {
	this.dir=dir;
	this.pos=pos;
	this.nb_Dep=nb_Dep;
}
/**
 * @return Direction for move
 */
public Direction getDir() {
	return this.dir;
}
/**
 * @return Position of the Vehicle is positioned
 */
public Position getPos() {
	return this.pos;
}
/**
 * @return number of move
 */
public int getNb_Dep() {
	return this.nb_Dep;
}

}
