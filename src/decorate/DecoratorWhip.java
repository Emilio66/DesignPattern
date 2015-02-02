package decorate;

public class DecoratorWhip extends CondimentDecorator {

	public DecoratorWhip(BeverageComponent bComponent, double cost) {
		super(bComponent, cost);
		this.description =bComponent.description+",Whip";
	}

}
