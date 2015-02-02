package decorate;

public class DecoratorMocha extends CondimentDecorator{

	public DecoratorMocha(BeverageComponent bComponent, double cost) {
		super(bComponent, cost);
		this.description=bComponent.description+",Mocha";
	}

}
