/**
 * the Car park
 * @author lefebvre julien
 *	
 */
public class Map {
	/**
	 * 	The default size of map
	 */
	private final static int DEFAULT_SIZE=6;
	/**
	 * 	The table of vehicle 
	 */
	public Vehicle[][] map;
	/**
	 *this constructor is going to create a game board in the form of a table where we will come to arrange our cars
	 */
	public Map()
	{
		this.map= new Vehicle[DEFAULT_SIZE][DEFAULT_SIZE];
		
	}
	/**
	 * this function adds the vehicle in such a way that it takes up as many squares as it sizes and in the right direction.
	 * @param car is vehicle to be added
	 */
	public void addCar(Vehicle car) {
		for(int i=0;i<car.getSize();i++) {
			if( car.getDir()=='x') {
				this.map[car.getY()][car.getX()+i]=car;
			}else if(car.getDir()=='y') {
				this.map[car.getY()+i][car.getX()]=car;
			}
		}
			
	}
	/**
	 *this function delete the vehicle in such a way that it takes up as many squares as it sizes and in the right direction.
	 * @param car is vehicle to be deletes
	 */
	public void supCar(Vehicle car) {
		for(int i=0;i<car.getSize();i++) {
			if( car.getDir()=='x') {
				this.map[car.getY()][car.getX()+i]=null;
			}else if(car.getDir()=='y') {
				this.map[car.getY()][car.getX()]=null;
			}
		}
	}

	/**
	 * this function allows you to find out whether a trip is possible or not
	 * @param car
	 * @param d is a displacement of 1 or -1
	 * @param lim is a limit of the table
	 * @param aut is the box on the board where the vehicle wants to go.
	 * @return true if the requested move is possible otherwise returns false
	 */
	public boolean depPos(Vehicle car,int d,int lim,int aut) {
		if(car.getDir()=='y') {
			if(car.getY()!=lim) 
				if(this.map[car.getY()+aut][car.getX()]==null) {
					return true;
					
			}else {return false;}
		}else if(car.getDir()=='x') {
			if(car.getX()!=lim) 
			if(this.map[car.getY()][car.getX()+aut]==null) {	
				return true;
			}else {return false;}
		}
		return false;
	}

	/**
	 * draw the table 
	 */
	public String toString() {
		String retour="";
		for(int i=0;i<DEFAULT_SIZE;i++) {
			for( int u=0;u<DEFAULT_SIZE;u++) {
				if(this.map[i][u]==null) {
					retour+=("    |");
				}else {
					retour+=(this.map[i][u].getName()+"|");
					}
			}
			retour+="\n";
			}
		return retour;
		}
}
