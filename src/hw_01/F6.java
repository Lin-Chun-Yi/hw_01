package hw_01;

public class F6 extends AbstractDrawFunction {
	
	public F6(){
		//no arg constructor
	}
	
	/**we calculate function in this method and return the final value*/
	@Override
	double f(double x) {
		// TODO Auto-generated method stub
		return 5 * Math.cos(x) + Math.sin(x);
	}

}
