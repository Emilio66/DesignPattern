package factory.Abstract;

/**
 * Using abstract ingredient factory to create various needed ingredients;
 * Using factory method to create a specific product
 * @author zhaozy
 */
class CHPizzaStore extends PizzaStore {
	CHIngredientFactory factory=new CHIngredientFactory();	//abstract factory for producing a group of products
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza=new CHCommonPizza();
		if(type != null && type.length()>0)
			switch (type) {
			case "cheese":
				pizza = new CHCheesePizza(factory);
				pizza.setName("Chicago Cheese Pizza");
				break;
			case "clam":
				pizza = new CHClamPizza(factory);
				pizza.setName("Chicago Clam PIzza");
			default:
				break;
			}
		return pizza;
	}
}
