package design.patterns.factory;

/**
 * @author Vinay
 *
 */
public class Divide implements Calculate {
	@Override
	public void calculate(double num1, double num2) {
		System.out.println("Division a/b= "+(num1/num2)); 
	}
}
