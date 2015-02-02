package decorate;

public class DecoratorSoy extends CondimentDecorator {

	public DecoratorSoy(BeverageComponent bComponent, double cost) {
		super(bComponent, cost);
		this.description=bComponent.description+",Soy";
	}

}
