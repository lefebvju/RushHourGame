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
	 *	
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
