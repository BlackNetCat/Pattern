package Fabrika;

public interface PizzaIngredientFactory {
	
	public Dough createDough ();
	public Sauce createSauce ();
	public Cheese createCheese ();
	public Veggies [] createVeggies ();
	public Papperoni createPapperoni();
	public Clams createClams ();

}
