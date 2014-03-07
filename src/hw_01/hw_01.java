package hw_01;
import java.util.Scanner;

public class hw_01 {
	/**Main method*/
	public static void main(String[] args){
		double x;//declare x
		
		//new a scanner
		Scanner input = new Scanner(System.in);
		
		//a.function
		System.out.println("Enter a number for f(x) = x^2");
		x = input.nextDouble();
		F1 f1 = new F1();
		System.out.println(f1.f(x));
		
		//b.function
		System.out.println("Enter a number for f(x) = sin(x)");
		x = input.nextDouble();
		F2 f2 = new F2();
		System.out.println(f2.f(x));
		
		//c.function
		System.out.println("Enter a number for f(x) = cos(x)");
		x = input.nextDouble();
		F3 f3 = new F3();
		System.out.println(f3.f(x));
		
		//d.function
		System.out.println("Enter a number for f(x) = tan(x)");
		x = input.nextDouble();
		F4 f4 = new F4();
		System.out.println(f4.f(x));
		
		//e.function
		System.out.println("Enter a number for f(x) = cos(x) + 5sin(x)");
		x = input.nextDouble();
		F5 f5 = new F5();
		System.out.println(f5.f(x));
		
		//f.function
		System.out.println("Enter a number for f(x) = 5cos(x) + sin(x)");
		x = input.nextDouble();
		F6 f6 = new F6();
		System.out.println(f6.f(x));
		
		//g.function
		System.out.println("Enter a number for f(x) = log(x) + x^2");
		x = input.nextDouble();
		F7 f7 = new F7();
		System.out.println(f7.f(x));
	}
}
