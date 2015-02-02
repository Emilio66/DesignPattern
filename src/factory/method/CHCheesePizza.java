package factory.method;

public class CHCheesePizza extends Pizza {

	public CHCheesePizza(){
		this.name="Chicago Cheese Pizza";
		this.sauce="Cheese";
		this.flavors.add("milk");
		this.flavors.add("egg");
	}
	@Override
	public void bake() {
		System.out.println("Little fire baked for 23 miniutes");
	}

}
