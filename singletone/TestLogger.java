package design.patterns.singletone;

/**
 * @author Vinay
 *
 */
public class TestLogger {

	public static void main(String[] args) {
		
		Logger obj1 = Logger.getInstance();
		Logger obj2 = Logger.getInstance();
		
		System.out.println("Obj= "+obj1.hashCode());
		System.out.println("Obj= "+obj2.hashCode());
	}

}
