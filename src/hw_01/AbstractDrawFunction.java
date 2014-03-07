package hw_01;
import java.awt.Polygon;

public abstract class AbstractDrawFunction {
	private Polygon p = new Polygon();
	
	protected AbstractDrawFunction(){
		drawFunction();
	}
	
	abstract double f(double x);
	
	public void drawFunction(){
		for(int x = -100 ; x <= 100 ; x++){
			p.addPoint(x + 200, 200 - (int)f(x));
		}
	}
}
