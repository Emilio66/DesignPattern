package decorate;

public class Espresso extends BeverageComponent {
	private double cost;
	public Espresso(double cost){
		this.description="Espresso";	//意大利浓咖啡
		this.cost = cost;
	}
	@Override
	public double cost() {
		return this.cost;
	}
	
	public void setCost(double c){
		this.cost = c;
	}
}
