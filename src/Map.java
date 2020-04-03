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
	/**
	 * 	The table of vehicle 
	 */
	private Vehicle[][] map;
	
	//TODO describe more accurately how is the board once created (content)
	/**
	 *this constructor is going to create a game board in the form of a table where we will come to arrange our cars
	 */
	public Map()
	{
		this.map= new Vehicle[DEFAULT_SIZE][DEFAULT_SIZE];
		
		// ...
		
	}
	
	/**
	 * this function adds the vehicle in such a way that it takes up as many squares as it sizes and in the right direction.
	 *s is a size
	 * @param theVehicle is vehicle to be added
	 */
	public void addCar(Vehicle theVehicle) {
		
		//TODO (done) please, dont "i" or "j"
		//TODO (done) "s" isn't better ;-)
		for(int size=0;size<theVehicle.getT_vehicle().getSize();size++) {
			if( Direction.horizontal.equals(theVehicle.getDir())) {
				this.map[theVehicle.getPos().getY()][theVehicle.getPos().getX()+size]=theVehicle;
			}else if(Direction.vertical.equals(theVehicle.getDir())) {
				this.map[theVehicle.getPos().getY()+size][theVehicle.getPos().getX()]=theVehicle;
			}
		}
			
	}
	
	/**
	 *this function delete the vehicle in such a way that it takes up as many squares as it sizes and in the right direction.
	 * @param car is vehicle to be deletes
	 */
	public void remove(Vehicle car) {
		for(int i=0;i<car.getT_vehicle().getSize();i++) {
			if(  Direction.horizontal.equals(car.getDir())) {
				this.map[car.getPos().getY()][car.getPos().getX()+i]=null;
			}else if( Direction.vertical.equals(car.getDir())) {
				this.map[car.getPos().getY()+i][car.getPos().getX()]=null;
			}
		}
	}

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
		if( Direction.vertical.equals(car.getDir())) {
			if(car.getPos().getY()!=lim) 
				if(this.map[car.getPos().getY()+aut][car.getPos().getX()]==null) {
					return true;
					
			}else {return false;}
		}else if( Direction.horizontal.equals(car.getDir())) {
			if(car.getPos().getX()!=lim) 
			if(this.map[car.getPos().getY()][car.getPos().getX()+aut]==null) {	
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
	if( Direction.vertical.equals(car.getDir())) {
				this.remove(car);
				car.getPos().setY(car.getPos().getY()+d);
				this.addCar(car);
	}else if( Direction.horizontal.equals(car.getDir())) {	
			this.remove(car);
			car.getPos().setX(car.getPos().getX()+d);
			this.addCar(car);
		}
}

/**
 * this forward function use the function depPos and the function move  
 * @param car
 */
private void advance( Vehicle car) {
	if(this.movePossible(car, 1, 6-car.getT_vehicle().getSize(),car.getT_vehicle().getSize()))
		this.move(car, 1, 6-car.getT_vehicle().getSize(),car.getT_vehicle().getSize());
	else System.out.println("impossible d'avancer");
}

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
					retour+=(this.map[i][u].getColor()+"|");
					}
			}
			retour+="\n";
			}
		return retour;
		}
}
