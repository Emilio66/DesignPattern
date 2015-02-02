package factory.Abstract;

public class NYClamPizza extends Pizza {
	private IngredientFactory factory;
	public NYClamPizza(NYIngredientFactory factory){
		this.factory=factory;
		this.flavors.add("30g strong spicy Italy sausage");
		this.flavors.add("20g garlic");
	}

	
	@Override
	public void prepare() {
		super.prepare();
		factory.createDough();
		factory.createSauce();
		factory.createClam();
	}


	@Override
	public void bake() {
		System.out.println("bake for 30 min at 400 degree");
	}

	@Override
	public void cut() {
		System.out.println("Cut into triangle slices");
	}

	@Override
	public void box() {
		System.out.println("Boxed with a megga hot paper\n");
	}

}
