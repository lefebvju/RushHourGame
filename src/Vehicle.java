import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * the vehicle needed in the car park
 *  
 * @author lefebvju
 */

public class Vehicle 
{
	
		
	/**
	 *	the type of the vehicle 
	 */
	private final Type t_vehicle;
	
	/**
	 * It's the position of the back of the car in map.
	 */
	private Position pos;
	
	
	/**
	 * dir is a direction of the car in the array which will be either x or y
	 */
	private final Direction dir;
	
	/**
	 * it's a color of car
	 */
	private final Color color;
	
	/**
	 * it's an Image for graphics interface
	 */
	private Image img;
	
	
	//TODO (done) gather x/y in a single Position object
	/**
	 * constructor with parameter for make car
	 * @param color of vehicle 
	 * @param pos It's the position of the back of the car.
	 * @param dir is the direction in the map
	 */
	public Vehicle(Color color,Position pos,Direction dir)
	{
		this.dir=dir;
		this.pos=pos;
		this.t_vehicle=Type.car;
		this.color=color;
		ImageIcon ico = new ImageIcon(getClass().getResource("/img/"+this.t_vehicle.getTypeImg()+"/"+this.dir.getDirImg()+"/"+this.color.getImg()+".png"));
		this.img = ico.getImage();
	}
	
	public Vehicle(int nb_color) {
		
		this.t_vehicle=Type.randomType();
		this.pos=new Position((int) (Math.random() * (7-this.t_vehicle.getSize())),(int) (Math.random() * (7-this.t_vehicle.getSize())));
		if(this.pos.getY()==2) {
			this.dir=Direction.vertical;
		}else {
			this.dir=Direction.randomDirection();
		}
		this.color=Color.values()[nb_color];
		ImageIcon ico = new ImageIcon(getClass().getResource("/img/"+this.t_vehicle.getTypeImg()+"/"+this.dir.getDirImg()+"/"+this.color.getImg()+".png"));
		this.img = ico.getImage();
	}
	
	//TODO (done) gather x/y in a single Position object
	/**
	 * constructor with parameter for make all vehicle
	 * @param color of vehicle 
	 * @param pos It's the position of the back of the car.
	 * @param dir is the direction in the map
	 * @param theVehicle is a type of the vehicle
	 */
	public Vehicle(Color color,Position pos,Direction dir,Type theVehicle)
	{
		this.dir=dir;
		this.pos=pos;
		this.t_vehicle=theVehicle;
		this.color=color;
		ImageIcon ico = new ImageIcon(getClass().getResource("/img/"+this.t_vehicle.getTypeImg()+"/"+this.dir.getDirImg()+"/"+this.color.getImg()+".png"));
		this.img = ico.getImage();
	}

	/**
	 * @return position in map
	 */
	public Position getPos() {
		return this.pos;
	}

	/**
	 * @param x is the position of the car on the abscissa axis
	 * @param y is the position of the car on the ordinate axis
	 */
	public void setPos(int x,int y) {
		this.pos = new Position(x,y);
	}
	
	/**
	 * modify the position of the Vehicle
	 * @param pos is a new position
	 */
	public void setPos(Position pos) {
		this.pos=pos;
	}
/**
 * 
 * @return direction of the vehicle
 */
	public Direction getDir() {
		return this.dir;
	}

/**
 * @return the type of the vehicle
 */
public Type getT_vehicle() {
	return this.t_vehicle;
}
/**
 * 
 * @return color of vehicle
 */
public Color getColor() {
	return this.color;
}

/**
 * this forward function
 */
public void advance() {
	this.setPos(this.getPos().getAdvancePosition(this.dir));
}

/**
 * this step back function 
 */
public void back() {
	this.setPos(this.getPos().getBackPosition(this.dir));
}

/**
 * 
 * @param pos is the position compared
 * @return true if the position is different
 */
public boolean equalsPos(Position pos) {
	if(this.dir==Direction.horizontal) {
		for(int posi=0;posi<this.getT_vehicle().getSize();posi++)
			if(pos.getX()==this.getPos().getX()+posi&&pos.getY()==this.getPos().getY()) {
				return true;
			}
	}else{
		for(int posi=0;posi<this.getT_vehicle().getSize();posi++)
			if(pos.getX()==this.getPos().getX()&&pos.getY()==this.getPos().getY()+posi) {
				return true;
			}
	}
	return false;
}

/**
 * return true if theVehicle has the same position of this Vehicle
 */
public boolean equalsPos (Vehicle theVehicle) {
	if(theVehicle.dir==Direction.horizontal) {
		for(int posi=0;posi<theVehicle.getT_vehicle().getSize();posi++)
			if(this.equalsPos(new Position(theVehicle.getPos().getX()+posi,theVehicle.getPos().getY()))) {
				return true;
			}
	}else{
		for(int posi=0;posi<theVehicle.getT_vehicle().getSize();posi++)
			if(this.equalsPos(new Position(theVehicle.getPos().getX(),theVehicle.getPos().getY()+posi))) {
				return true;
			}
	}
	return false;
}

/**
 * create a new vehicle
 */
public Vehicle copy() {
	Vehicle ret= new Vehicle(this.getColor(),this.getPos().copy(),this.getDir(),this.getT_vehicle());
	return ret;
}

/**
 * return the Image of this Vehicle
 */
Image getImg() {
	return this.img;
}
}

