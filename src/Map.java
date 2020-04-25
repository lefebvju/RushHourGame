//TODO (done) format code
import java.util.ArrayList;

/**
 * the Car park
 * @author lefebvre julien
 *	
 */
public class Map {

	// TODO this internal representation will not be relevant to handle player moves.
	// -> u will have to search for every part of a given car...
	// reconsider representing map not as Vehicle[][] but as Vehicle[], encapsulating in a vehicle all the positions it occupies on map.
	// ask !
	private final static int DEFAULT_SIZE=6;
	/**
	 * 	it's a car chart where the coordinates of the car place the back 
	 * of the car and where the rest of the car will be placed according to the size 
	 * and management.
	 * the boxes are numbered in column from 0 to 6 and in line from 0 to 6. 
	 *For example, a car in the top left corner will be [0][0] and in the bottom right corner will be [5][5]. 
	 *The coordinates are managed in the following way [row][column].
	 */
    private ArrayList<Vehicle> map;
    
	//TODO describe more accurately how is the board once created (content) (not done, ask!!)
	/**
	 *this constructor is going to create a game board in the form of a table where we will come to arrange our cars
	 *this table is created in a dimension of 6 by 6 and this table represents a parking lot.
	 *
	 */
	public Map()
	{
		this.map= new ArrayList<Vehicle>();
		
	}
	
	/**
	 * this function adds the vehicle in such a way that it takes up as many squares as it sizes and in the right direction.
	 * @param theVehicle is vehicle to be added
	 */
	public void addCar(Vehicle theVehicle) {
		this.map.add(theVehicle);
		}
			
	
	
	/**
	 *this function delete the vehicle in such a way that it takes up as many squares as it sizes and in the right direction.
	 * @param car is vehicle to be deletes
	 */
	public void remove(Vehicle car) {
		this.map.remove(car); 
	}

	//TODO (done) why box are ints ???
	/**
	 * this function allows you to find out whether a trip is possible or not
	 * @param car
	 * @return true if the requested move in front is possible otherwise returns false
	 */
	public boolean movePossible_Front(Vehicle car) {
		if( Direction.vertical.equals(car.getDir())) {
			if(car.getPos().getY()+car.getT_vehicle().getSize()-1<5) {
				Position pos_dep =new Position(car.getPos().getX(),car.getPos().getY()+car.getT_vehicle().getSize());
				for(Vehicle leVehicle:this.map) {
					if(leVehicle.equalsPos(pos_dep)) {
					return false;
			}}return true;}
		}else if( Direction.horizontal.equals(car.getDir())) {
			if(car.getPos().getX()+car.getT_vehicle().getSize()-1<5) {
				Position pos_dep =new Position(car.getPos().getX()+car.getT_vehicle().getSize(),car.getPos().getY());
				for(Vehicle leVehicle:this.map) {
					if(leVehicle.equalsPos(pos_dep)) {
						return false;
			}}return true;}
		}
		return false;
	}
	/**
	 * this function allows you to find out whether a trip is possible or not
	 * @param car
	 * @return true if the requested move in back is possible otherwise returns false
	 */
	public boolean movePossible_Back(Vehicle car) {
		if( Direction.vertical.equals(car.getDir())) {
			if(car.getPos().getY()>0) {
				Position pos_dep =new Position(car.getPos().getX(),car.getPos().getY()-1);
				for(Vehicle leVehicle:this.map) {
					if(leVehicle.equalsPos(pos_dep)) {
					return false;
			}}return true;}
		}else if( Direction.horizontal.equals(car.getDir())) {
			if(car.getPos().getX()>0) {
				Position pos_dep =new Position(car.getPos().getX()-1,car.getPos().getY());
				for(Vehicle leVehicle:this.map) {
					if(leVehicle.equalsPos(pos_dep)) {
						return false;
			}}return true;}
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
				car.getPos().setY(car.getPos().getY()+d);
				
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
public void advance( Vehicle car) {
	if(movePossible_Front(car)) 
		car.advance();
	else System.out.println("impossible d'avancer");
	
}

/**
 * this step back function use the function depPos and the function move  
 * @param car
 */
public void back(Vehicle car) {
	if(this.movePossible_Back(car))
		car.back();
	else System.out.println("impossible de reculer");
}

	@Override
	public String toString() {
		String retour="";
		for(int row=0;row<DEFAULT_SIZE;row++) {
			for( int col=0;col<DEFAULT_SIZE;col++) {
				boolean write = false;
				Position pos_case =new Position(col,row);
				for(Vehicle leVehicle:this.map) {
					if(leVehicle.equalsPos(pos_case)) {
						if(col==5 && row==2) {
							retour+=leVehicle.getColor()+"->";
							write=true;
						}else {
							retour+=(leVehicle.getColor()+"|");
							write=true;
						}
					}} if(!write&&col==5 && row==2) {
						retour+=("   -->");
					}else if(!write) {
						retour+=("    |");
					}
					
				}
			retour+="\n";
			}
		return retour;
		}
}
