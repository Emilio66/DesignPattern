package factory.method;

class CHPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza=new CHCommonPizza();
		if(type != null && type.length()>0)
			switch (type) {
			case "cheese":
				pizza = new CHCheesePizza();
				break;
			case "pepperoni":
				pizza = new CHPepperoniPizza();
			default:
				break;
			}
		return pizza;
	}
}
