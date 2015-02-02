package decorate;

/**
 * 装饰品：饮料的配料，继承自饮料组件
 * @author zhaozy
 *
 */
public class CondimentDecorator extends BeverageComponent {
	BeverageComponent beverage;	//饮料配料中都拥有一个饮料的主体，便于计算价格
	private double cost;
	
	public CondimentDecorator(BeverageComponent bComponent,double cost){
		this.beverage=bComponent;
		this.cost=cost;
	}
	
	@Override
	public double cost() {
		return beverage.cost()+this.cost;
	}
	
	public void setCost(double c){
		this.cost = c;
	}
}
