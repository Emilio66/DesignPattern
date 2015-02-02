package factory.method;

public class NYCheesePizza extends Pizza {

	public NYCheesePizza(){
		this.name="New York Cheese Pizza";
		this.sauce="Cheese";
		this.flavors.add("milk");
		this.flavors.add("spice");
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
