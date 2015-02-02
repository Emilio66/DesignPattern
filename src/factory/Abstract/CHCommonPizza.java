package factory.Abstract;

public class CHCommonPizza extends Pizza {

	public CHCommonPizza(){
		this.name = "Chicago Style Pizza";
		this.sauce = "chocolate";
		this.flavors.add("sesame");
	}
	
	@Override
	public void box() {
		System.out.println("Place pizza in Chicago Style Pizza Store box\n");
	}

}
