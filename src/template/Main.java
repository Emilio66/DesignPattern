package template;

public class Main {
	
	public static void main(String args[]){
		CaffeineBeverage coffee = new Coffee();
		CaffeineBeverage tea	= new Tea();
		
		System.out.println("============== Making Coffee ================");
		coffee.makeBeverage();
		
		System.out.println("\n============== Making Tea ================");
		tea.makeBeverage();
	}
}
