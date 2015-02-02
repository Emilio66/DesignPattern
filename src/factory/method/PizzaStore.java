package factory.method;

public abstract class PizzaStore {
	/**
	 * factory method which creates the specific product, vary from factory to factory
	 * isolate the variable part of implementing from using
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
	
	/**
	 * The whole procedure frome ordering to eatable food 
	 * @param type
	 */
	public void orderPizza(String type){
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
	
}
