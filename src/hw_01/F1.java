package hw_01;

public class F1 extends AbstractDrawFunction {
	
	public F1(){
		//no arg constructor
	}
	
	/**we calculate function in this method and return the final value*/
	@Override
	double f(double x) {
		// TODO Auto-generated method stub
		return Math.pow(x, 2);
	}
}
