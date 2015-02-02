package factory.Abstract;

public class CHCheesePizza extends Pizza {
	private IngredientFactory factory;
	
	public CHCheesePizza(CHIngredientFactory factory){
		this.factory= factory;
		this.flavors.add("milk");
		this.flavors.add("egg");
	}
	
	public void prepare(){
		super.prepare();
		factory.createDough();
		factory.createSauce();
		factory.createCheese();
	}
	
	@Override
	public void bake() {
		System.out.println("Little fire baked for 23 miniutes");
	}

}
