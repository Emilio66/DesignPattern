package beginner;

public class RedheadDuck extends Duck {
	public RedheadDuck(){
		flyBehavior = new FlyWithWings(); 
		quakBehavior = new QuakByMouth();
	}
}
