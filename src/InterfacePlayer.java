import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfacePlayer extends JFrame implements Player  {

	
	public Scene panel;
	
	
	
	public InterfacePlayer(Map map) {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(740, 670);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.setAlwaysOnTop(true);
	panel=new Scene	(map);
	this.setContentPane(panel);
	this.setVisible(true);
	
	Movement mv=new Movement(this.getComponents());
	
	}
	@Override
	public Move AskMove() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
