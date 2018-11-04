package design.patterns.facade;

public class Client {
	public static void main (String[] args) 
    { 
		/*Client have to only access the reception class 
		and can make the respective orders without knowing 
		the underlying complex system implementation		
	    */        
		ReceptionFacade recp = new ReceptionFacade(); 
          
        VegMenu v = recp.getVegMenu(); 
        NonVegMenu nv = recp.getNonVegMenu(); 
        Both = recp.getVegNonMenu(); 
    } 
}
