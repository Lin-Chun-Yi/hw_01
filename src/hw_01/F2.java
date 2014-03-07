package hw_01;

public class F2 extends AbstractDrawFunction {
	
	public F2(){
		//no arg constructor
	}
	
	/**we calculate function in this method and return the final value*/
	@Override
	double f(double x) {
		
		return Math.sin(x);
	}
}
