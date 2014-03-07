package hw_01;

public class F5 extends AbstractDrawFunction {
	
	public F5(){
		//no arg constructor
	}
	
	/**we calculate function in this method and return the final value*/
	@Override
	double f(double x) {
		// TODO Auto-generated method stub
		return Math.cos(x) + 5 * Math.sin(x);
	}

}
