package design.patterns.singletone;
/**
 * @author Vinay
 *
 */

/** Singletone pattern insure that there is only one object of class is present
 * for example: only one instance of Print should be present and reused whenever needed
 * otherwise multiple objects will block the queue*/

public class Logger {
	//Create instance of class here itself
	private static Logger logger;
	
	//Make the constructor private	
	private Logger() {
		
	}
	//Create method which will check whether instance is already created
	public static Logger getInstance() {
		
		if(logger == null){
			logger = new Logger();
		}
		return logger;
	}
}
