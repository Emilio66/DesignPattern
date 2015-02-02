package factory.Abstract;

/**
 * Using abstract ingredient factory to create various needed ingredients;
 * Using factory method to create a specific product
 * @author zhaozy
 */
public class NYPizzaStore extends PizzaStore {
	NYIngredientFactory factory= new NYIngredientFactory();
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza=new NYCommonPizza();
		if(type != null && type.length()>0)
			switch (type) {
			case "cheese":
				pizza = new NYCheesePizza(factory);
				pizza.setName("New York Cheese Pizza");
				break;
			case "clam":
				pizza = new NYClamPizza(factory);
				pizza.setName("New York Clam Pizza");
			default:
				break;
			}
		return pizza;
	}

}
