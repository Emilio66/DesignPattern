package beginner;

public class RubberDuck extends Duck {
	public RubberDuck() {
		flyBehavior = new FlyWithNothing();
		quakBehavior = new Queak();
	}
}
