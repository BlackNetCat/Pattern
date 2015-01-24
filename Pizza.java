package Fabrika;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies [];
	Cheese cheese;
	Papperoni papperoni;
	Clams clam;
	
	abstract void prepare ();
	
	  void bake () {
		  System.out.println("Bake for 25 minutes at 365");
	  }
	  
	  void cut (){
		  System.out.println("Cutting the pizza into diagonal slaces");
	  }
	  
	  void box (){
		  System.out.println("Place Pizza in official PizzaStore Box");
		  
	  }
	  
	  
	  public String getName (){
		  return name;
	  }
	  
	 

	  public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	}

