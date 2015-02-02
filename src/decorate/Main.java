package decorate;

public class Main {
	public static void main(String [] args){
		BeverageComponent darkRoast = new DarkRoast(9.99);
		BeverageComponent espresso = new Espresso(11.11);
		
		CondimentDecorator whip = new DecoratorWhip(darkRoast, 2.333);	//使用 whip 装饰 darkroast
		CondimentDecorator mocha = new DecoratorMocha(whip, 3.44);		//使用 mocha 装饰已经用 whip 装饰的darkroast
		System.out.println("Beverage: "+mocha.getDescription()+"\t cost: "+mocha.cost());//一层层包裹，算出总价
				
		CondimentDecorator soy =new DecoratorSoy(espresso, 1.21);
		CondimentDecorator milk = new DecoratorMilk(soy, 4.31);
		System.out.println("Beverage: "+milk.getDescription()+"\t cost: "+milk.cost());
	}
}
