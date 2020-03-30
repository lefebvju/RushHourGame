//TODO format code
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

	//TODO explain how RH map coordinate system maps to [][], with examples
	//TODO (done) field should not be public
	/**
	 * 	The table of vehicle 
	 */
	private Vehicle[][] map;
	
	//TODO decribe more accurately how is the board once created (content)
	/**
	 *this constructor is going to create a game board in the form of a table where we will come to arrange our cars
	 */
	public Map()
	{
		this.map= new Vehicle[DEFAULT_SIZE][DEFAULT_SIZE];
		
		// ...
		
	}
	
	//TODO (done) use same word (Car or Vehicle, but not both)
	/**
	 * this function adds the vehicle in such a way that it takes up as many squares as it sizes and in the right direction.
	 *s is a size
	 * @param theVehicle is vehicle to be added
	 */
	public void addCar(Vehicle theVehicle) {
		
		//TODO (done) please, dont "i" or "j"
		for(int s=0;s<theVehicle.getSize();s++) {
			if( theVehicle.getDir()=='x') {
				this.map[theVehicle.getY()][theVehicle.getX()+s]=theVehicle;
			}else if(theVehicle.getDir()=='y') {
				this.map[theVehicle.getY()+s][theVehicle.getX()]=theVehicle;
			}
		}
			
	}
	
	//TODO (done) rename to remove...
	/**
	 *this function delete the vehicle in such a way that it takes up as many squares as it sizes and in the right direction.
	 * @param car is vehicle to be deletes
	 */
	public void remove(Vehicle car) {
		for(int i=0;i<car.getSize();i++) {
			if( car.getDir()=='x') {
				this.map[car.getY()][car.getX()+i]=null;
			}else if(car.getDir()=='y') {
				this.map[car.getY()+i][car.getX()]=null;
			}
		}
	}

	//TODO (done) rename this method
	//TODO why box are ints ???
	/**
	 * this function allows you to find out whether a trip is possible or not
	 * @param car
	 * @param d is a displacement of 1 or -1
	 * @param lim is a limit of the table
	 * @param aut is the box on the board where the vehicle wants to go.
	 * @return true if the requested move is possible otherwise returns false
	 */
	public boolean movePossible(Vehicle car,int d,int lim,int aut) {
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
	 * function to move the car
	 * @param car
	 * @param d is a displacement of 1 or -1
	 * @param lim is a limit of the table
	 * @param aut is the box on the board where the vehicle wants to go.
	 */
public void move(Vehicle car,int d,int lim,int aut) {
	if(car.getDir()=='y') {
				this.remove(car);
				car.setY(car.getY()+d);
				this.addCar(car);
	}else if(car.getDir()=='x') {	
			this.remove(car);
			car.setX(car.getX()+d);
			this.addCar(car);
		}
}

//TODO (done) this method should not be public
/**
 * this forward function use the function depPos and the function move  
 * @param car
 */
private void advance(Vehicle car) {
	if(this.movePossible(car, 1, 6-car.getSize(),car.getSize()))
	this.move(car, 1, 6-car.getSize(),car.getSize());
	else System.out.println("impossible d'avancer");
}

//TODO(done) this method should not be public
/**
 * this step back function use the function depPos and the function move  
 * @param car
 */
private void back(Vehicle car) {
	if(this.movePossible(car, -1,0,-1))
	this.move(car, -1,0,-1);
	else System.out.println("impossible d'avancer");
}

	@Override
	public String toString() {
		String retour="";
		for(int i=0;i<DEFAULT_SIZE;i++) {
			for( int u=0;u<DEFAULT_SIZE;u++) {
				if(this.map[i][u]==null) {
					if(i==2 && u==5)
						retour+="";
					else retour+=("    |");
				}else {
					retour+=(this.map[i][u].getName()+"|");
					}
			}
			retour+="\n";
			}
		return retour;
		}
}
