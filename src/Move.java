
/**
 * it's a class of 
 * @author lefeb
 *
 */
public class Move {
	
/**
 * 
 */
private final Travel dep;
/**
 * 
 */
private final Position pos;
/**
 * 
 */
private final int nb_Dep;

/**
 * @param dep
 * @param pos
 * @param nb_Dep
 */
public Move(Travel dep,Position pos,int nb_Dep) {
	this.dep=dep;
	this.pos=pos;
	this.nb_Dep=nb_Dep;
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
/**
 * @return direction of travel
 */
public Travel getDep() {
	return this.dep;
}

}
