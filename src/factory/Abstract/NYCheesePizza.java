package factory.Abstract;

public class NYCheesePizza extends Pizza {
	private IngredientFactory factory;
	public NYCheesePizza(NYIngredientFactory factory){
		this.factory= factory;
		this.flavors.add("milk");
		this.flavors.add("spice");
	}
	public void prepare(){
		super.prepare();
		factory.createDough();
		factory.createSauce();
		factory.createCheese();
	}
	
	@Override
	public void bake() {
		System.out.println("Middle size fire for 10 miniutes");
	}

	@Override
	public void box() {
		System.out.println("Place in a lovely milky box\n");
	}

}
