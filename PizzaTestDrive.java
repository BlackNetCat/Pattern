package Fabrika;

public class PizzaTestDrive {

	public static void main(String[] args) {
		
		PizzaStore nyPizzaStore = new NYPizzaStore ();
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		pizza.pizzaComponents();
		
		
		System.out.println("Ethan ordered a "+ pizza.getName()+"name");
		
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore ();
		pizza = chicagoPizzaStore.orderPizza("cheese");
		pizza.pizzaComponents();
		
		System.out.println("Joel ordered a "+ pizza.getName()+"name");
		
		
	}

	
}
