package factory.method;

public class NYCommonPizza extends Pizza {

	public NYCommonPizza(){
		this.name="New York Pizza";
		this.sauce="peanut butter";
		this.flavors.add("nuts");
		this.flavors.add("sugar");
	}
	@Override
	public void bake() {
		System.out.println("Little fire baked for 20 miniutes");
	}
	
	@Override
	public void box() {
		System.out.println("Box it with big words 'New York' printed\n");
	}

}
