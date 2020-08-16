import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


/**
 * @author lefeb
 *
 */
@SuppressWarnings("javadoc")
public class InterfacePlayer extends JFrame implements Player,MouseListener,MouseMotionListener {

	
	/**
	 * 
	 */
	private Scene panel;
	/**
	 * 
	 */
	private int x=0;
	/**
	 * 
	 */
	private int y=0;
	/**
	 * 
	 */
	private int nb_dep=0;
	/**
	 * 
	 */
	private Travel dir=null;
	
	
	/**
	 * @param map for add map in interface 
	 */
	public InterfacePlayer(Map map) {
	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	this.setSize(740, 670);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.setAlwaysOnTop(true);
	this.setPanel(new Scene	(map));
	this.setContentPane(this.getPanel());
	this.setVisible(true);
	
	
	
	}
	@Override
	public Move AskMove() {
		synchronized(this) {
		// TODO Auto-generated method stub
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setNb_dep(0);
		while(this.getNb_dep()==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		}
		return new Move(getDir(),new Position(this.x,this.y), getNb_dep());
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		synchronized (this) {
		int depx=((e.getX()-22)/112)-this.x;
		int depy=((e.getY()-44)/100-this.y);
		if(depx<0||depy<0) {
			this.setDir(Travel.back);
			if(depx<depy) {
				this.setNb_dep(Math.abs(depx));
			}else {
				this.setNb_dep(Math.abs(depy));
			}
		}else {
			this.setDir(Travel.forth);
			if(depx>depy) {
				this.setNb_dep(depx);
			}else {
				this.setNb_dep(depy);
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
		this.setY((e.getY()-44)/100);
	
		
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
		
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
			
	}
	/**
	 * @return
	 */
	public Travel getDir() {
		return this.dir;
	}
	/**
	 * @param dir
	 */
	public void setDir(Travel dir) {
		this.dir = dir;
	}
	
	/**
	 * @return
	 */
	public int gety() {
		return this.y;
	}
	/**
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return
	 */
	public Scene getPanel() {
		return this.panel;
	}
	/**
	 * @param panel
	 */
	public void setPanel(Scene panel) {
		this.panel = panel;
	}
	/**
	 * @return
	 */
	public int getNb_dep() {
		return this.nb_dep;
	}
	/**
	 * @param nb_dep
	 */
	public void setNb_dep(int nb_dep) {
		this.nb_dep = nb_dep;
	}
	

}
