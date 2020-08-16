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
	Travel dir=null;
	
	
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
		synchronized (this) {
		int depx=((e.getX()-22)/112)-this.x;
		int depy=((e.getY()-44)/100-this.y);
		if(depx<0||depy<0) {
			this.dir=Travel.back;
			if(depx<depy) {
				this.nb_dep=Math.abs(depx);
			}else {
				this.nb_dep=Math.abs(depy);
			}
		}else {
			this.dir=Travel.forth;
			if(depx>depy) {
				this.nb_dep=depx;
			}else {
				this.nb_dep=depy;
			}
		}
		notifyAll();
		}
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
		
		// TODO Auto-generated method stub
		this.x=(e.getX()-22)/112;
		this.y=(e.getY()-44)/100;
	
		
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
			
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
