package decorate;

public abstract class BeverageComponent {
	protected String description;
	
	public abstract double cost();
	
	public String getDescription(){
		return this.description;
	}
}
