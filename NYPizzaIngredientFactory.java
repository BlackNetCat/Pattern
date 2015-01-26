package Fabrika;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	
	public Dough createDough (){
		return new ThinCrustDough();
	}
	public Sauce createSauce (){
		return new MarinaraSauce ();
	}
	
	public Veggies [] createVeggies (){
		Veggies veggies [] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper ()};
		return veggies;
	}
	public Papperoni createPapperoni(){
		return new SlicedPapperoni ();
	}
	
	public Clams createClams (){
		return new FreshClams ();
	}
	@Override
	public Cheese createCheese() {
		
		return null;
	}
}
