package factory.method;

public class Main {


	public static void main(String[] args) {
		PizzaStore store1 = new NYPizzaStore();
		PizzaStore store2 = new CHPizzaStore();
		
		store1.orderPizza("");
		store2.orderPizza(null);
		store2.orderPizza("cheese");
		store1.orderPizza("pepperoni");
		store2.orderPizza("pepperoni");
		store1.orderPizza("cheese");
	}

}
