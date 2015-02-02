package factory.Abstract;

public class Main {

	public static void main(String[] args) {
		PizzaStore store1 = new NYPizzaStore();
		PizzaStore store2 = new CHPizzaStore();
				
		store2.orderPizza("cheese");
		store1.orderPizza("clam");
		store2.orderPizza("clam");
		store1.orderPizza("cheese");
	}

}
