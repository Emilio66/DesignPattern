package factory.method;

public class NYPepperoniPizza extends Pizza {
	public NYPepperoniPizza(){
		this.name="New York Pepperoni Pizza";
		this.sauce="Pepper";
		this.flavors.add("30g strong acrid peppers");
		this.flavors.add("20g garlic");
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
