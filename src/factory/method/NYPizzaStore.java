package factory.method;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza=new NYCommonPizza();
		if(type != null && type.length()>0)
			switch (type) {
			case "cheese":
				pizza = new NYCheesePizza();
				break;
			case "pepperoni":
				pizza = new NYPepperoniPizza();
			default:
				break;
			}
		return pizza;
	}

}
