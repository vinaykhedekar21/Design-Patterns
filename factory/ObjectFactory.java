package design.patterns.factory;

public class ObjectFactory {
	
	//Super class can hold object of subclasses
	public Calculate getCalculation(String type) {
		
		Calculate calObj = null;
		
		if (type.toLowerCase().equals("add")) {
			calObj = new Add();
		}
		if (type.toLowerCase().equals("subtract")) {
			calObj = new Subtract();
		}
		if (type.toLowerCase().equals("divide")) {
			calObj = new Divide();
		}
		
		return calObj; 
	}
	
}
