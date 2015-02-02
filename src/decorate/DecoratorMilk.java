package decorate;

public class DecoratorMilk extends CondimentDecorator {

	public DecoratorMilk(BeverageComponent bComponent, double cost) {
		super(bComponent, cost);
		this.description=bComponent.description+",Milk";
	}

}
