package design.patterns.facade;

public class VegNonVegRestaurant implements Hotel{
	 public Menus getMenus() 
	    { 
	        Both b = new Both(); 
	        return b; 
	    } 
}
