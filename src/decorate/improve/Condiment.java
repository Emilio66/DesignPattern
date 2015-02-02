package decorate.improve;

public class Condiment {
	private String description;
	private double cost;
	
	public Condiment(){}
	
	public Condiment(String desc, double c){
		this.description=desc;
		this.cost=c;
	}
	
	public String desc(){
		return description;
	}
	public double cost(){
		return cost;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}	
	
}
