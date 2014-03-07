package hw_01;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;
/**extends JPanel is not important, we just write a object for other objects can use
 * method in it. let others easier to write. above three import also not important.*/
public abstract class AbstractDrawFunction extends JPanel{
	/**polygon to hold the points (not important in it)*/
	private Polygon p = new Polygon();
	
	/**draw method (not important in it)*/
	protected AbstractDrawFunction(){
		drawFunction();
	}
	
	/**return the y-coordinate*/
	abstract double f(double x);
	
	/**obtain points (not important in it)*/
	public void drawFunction(){
		for(int x = -100 ; x <= 100 ; x++){
			p.addPoint(x + 200, 200 - (int)f(x));
		}
	}
	
	/**draw axes, labels, and connect points (not important in it)*/
	@Override
	protected void paintComponent(Graphics g){
		
	}
}
