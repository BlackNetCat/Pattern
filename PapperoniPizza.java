package Fabrika;

public class PapperoniPizza extends Pizza {
PizzaIngredientFactory ingredientFactory;
	
	public PapperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	
		@Override
	void prepare() {
		System.out.println("Preparing"+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		papperoni = ingredientFactory.createPapperoni();
		
	}
}
