package hw_01;

public class F7 extends AbstractDrawFunction {
	
	public F7(){
		//no arg constructor
	}
	
	/**we calculate function in this method and return the final value*/
	@Override
	double f(double x) {
		// TODO Auto-generated method stub
		return Math.log10(x) + Math.pow(x, 2);
	}

}
