package factory.Abstract;

public class CHClamPizza extends Pizza {
	private IngredientFactory factory;
	public CHClamPizza (CHIngredientFactory factory) {
		this.factory=factory;
		this.flavors.add("50g gentle acrid peppers");
	}

	public void prepare(){
		super.prepare();
		factory.createDough();
		factory.createSauce();
		factory.createClam();
	}
}
