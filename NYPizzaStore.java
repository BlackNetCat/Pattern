package Fabrika;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza =null;
		
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (type.equals("cheese")){
			pizza = new CheesePizza (ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza (ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		
		} else if (type.equals("clam")){		
			pizza = new ClamPizza (ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		
		} else if (type.equals("papperoni")) {
			pizza = new PapperoniPizza (ingredientFactory);
			pizza.setName("New York Style Papperoni Pizza");
		}
		return pizza;
		}
	}


