package beginner;

public class DecoyDuck extends Duck{
	public DecoyDuck(){
		flyBehavior =new FlyWithTail();
		quakBehavior =new QuakWithLung();
	}
}
