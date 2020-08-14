import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class InterfacePlayer extends JFrame implements Player,MouseListener,MouseMotionListener {

	
	public Scene panel;
	private int x=0,y=0,nb_dep=0;
	Travel dir=Travel.forth;
	
	
	public InterfacePlayer(Map map) {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(740, 670);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.setAlwaysOnTop(true);
	panel=new Scene	(map);
	this.setContentPane(panel);
	this.setVisible(true);
	
	
	
	}
	@Override
	public Move AskMove() {
		synchronized(this) {
		// TODO Auto-generated method stub
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.nb_dep=0;
		while(this.nb_dep==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		}
		return new Move(dir,new Position(x,y), nb_dep);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("x="+((e.getX()+e.getComponent().getX()))+"\ny="+(e.getY()+e.getComponent().getY()));
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mousePressed(MouseEvent e) {
		synchronized(this) {
		// TODO Auto-generated method stub
		this.x=(e.getX()-22)/112;
		this.y=(e.getY()-44)/100;
		System.out.println(x+";"+y);
		this.nb_dep=1;
		notifyAll();
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {

		// TODO Auto-generated method stub
		//System.out.println("y2:"+e.getY());
		//System.out.println("x2:"+e.getX());
		int depx=e.getX()/100-this.x;
		int depy=e.getY()/100-this.y;
		
			nb_dep=1;
			this.dir=Travel.forth;
			
	}
		
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
			
	}
	

}
