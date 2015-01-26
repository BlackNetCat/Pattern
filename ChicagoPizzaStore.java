package Fabrika;

public class ChicagoPizzaStore extends PizzaStore {
	

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory ();
		if (type.equals("cheese")){
			pizza = new CheesePizza (ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
			
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza (ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		
		} else if (type.equals("clam")){		
			pizza = new ClamPizza (ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		
		} else if (type.equals("papperoni")) {
			pizza = new PapperoniPizza (ingredientFactory);
			pizza.setName("Chicago Style Papperoni Pizza");
		}
		return pizza;
		}

}
