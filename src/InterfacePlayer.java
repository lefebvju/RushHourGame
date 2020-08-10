import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfacePlayer implements Player {

	JFrame window = new JFrame("RushHour Game");
	public Scene panel;
	
	
	
	public InterfacePlayer(Map map) {
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(740, 670);
	window.setLocationRelativeTo(null);
	window.setResizable(false);
	window.setAlwaysOnTop(true);
	panel=new Scene	(map);
	window.setContentPane(panel);
	window.setVisible(true);
	}
	@Override
	public Move AskMove() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
