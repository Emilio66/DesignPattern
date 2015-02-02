package decorate;

/**
 * 饮料的主体，继承自饮料组件
 * @author zhaozy
 *
 */
public class DarkRoast extends BeverageComponent {
	private double cost;
	public DarkRoast(double cost){
		this.description="DarkRoast";//深度烘焙咖啡
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
