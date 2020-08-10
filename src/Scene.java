
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Scene extends JPanel {

	private ImageIcon icoFond;
	private Image imgFond1;

	
	private int xFond1;
	private Map map;
	
	//**** CONSTRUCTEUR ****//	
	public Scene(Map map){
		
		super();
		this.map=map;
		
		this.xFond1 = 0;
		
		icoFond = new ImageIcon(getClass().getResource("/img/FondJeu.png"));
		this.imgFond1 = this.icoFond.getImage();
	
	}
	
	
	//**** METHODES ****//
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.imgFond1, this.xFond1, 0, null); // Dessin de l'image de fond  		 	    
		for(Vehicle theVehicle:this.map.map) {
			g2.drawImage(theVehicle.getImg(),theVehicle.getPos().getX()*113+15,theVehicle.getPos().getY()*102+13,null);
			
		}
	}
}
