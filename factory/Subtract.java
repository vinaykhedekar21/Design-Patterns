package design.patterns.factory;

public class Subtract implements Calculate {
	@Override
	public void calculate(double num1, double num2) {
		System.out.println("Substraction a-b= "+(num1-num2)); 
	}
}
