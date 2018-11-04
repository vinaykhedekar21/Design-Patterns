package design.patterns.factory;

public class TestFactoryPattern {
	
	//Get objects from the factory class and then use them for the further purpose
	public static void main(String[] args) {
		System.out.println("<----Factory pattern demo---->");
		double num1 = 5;
		double num2 = 8;
		
		ObjectFactory objFactory = new ObjectFactory();
		Calculate obj1 = objFactory.getCalculation("add");
		Calculate obj2 = objFactory.getCalculation("subtract");
		Calculate obj3 = objFactory.getCalculation("divide");
		
		obj1.calculate(num1, num2);
		obj2.calculate(num1, num2);
		obj3.calculate(num1, num2);
	}
}
