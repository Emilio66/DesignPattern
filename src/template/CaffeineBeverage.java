package template;

/**
 * Template Pattern outlines a procedure of algorithms
 * @author zhaozy
 */
public abstract class CaffeineBeverage {
	//these two methods varies in sub-class, abstracted from concrete class and must be implemented
	abstract void brew();
	abstract void addCondiments();
	
	//these two methods are common
	void boilWater(){
		System.out.println("Boiling water");
	}
	
	void pourInCup(){
		System.out.println("Pouring in cup");
	}
	
	//this is a hook, decide the next step
	boolean wantCondiments(){
		return true;
	}
	void makeBeverage(){
		boilWater();
		brew();
		pourInCup();
		if (wantCondiments()) {
			addCondiments();
		}
		System.out.println("Here you are !");
	}
	
}
