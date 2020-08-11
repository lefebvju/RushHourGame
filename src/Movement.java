import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Movement implements MouseListener,MouseMotionListener {

	
	private int X,Y;
	
	public Movement(Component... pns) {
		
		
		for(Component panel:pns) {
			panel.addMouseListener(this);
			panel.addMouseMotionListener(this);
				
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//e.getComponent().setLocation((e.getX()+e.getComponent().getX())-this.X,(e.getY()+e.getComponent().getY())-this.Y);
		System.out.println("x="+((e.getX()+e.getComponent().getX())-this.X)+"\ny="+(e.getY()+e.getComponent().getY()));
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
		this.X=e.getX();
		this.Y=e.getY();
		System.out.println(X);
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

}
