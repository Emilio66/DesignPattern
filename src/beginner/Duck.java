package beginner;

/**
 * abstract duck, separate variable parts from invariable parts
 * Behavior class, isolated from the constant part, do the change part.
 * @author zhaozy
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuakBehavior quakBehavior;
	
	//these are common parts which can be extended
	public void swim(){
		System.out.println("Every dock can float in the water ....");
	}
	public void display(){
		System.out.println("hello, kid");
	}
	
	//these are variable parts, sub-class can implements different interface but invokes the same method
	public void fly(){
		flyBehavior.performFly();		
	}
	
	public void quake(){
		quakBehavior.performQuark();
	}
	
	//change behaviors in the run time dynamically
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuakBehavior(QuakBehavior quakBehavior) {
		this.quakBehavior = quakBehavior;
	}
	
}
