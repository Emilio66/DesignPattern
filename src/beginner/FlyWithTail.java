package beginner;

public class FlyWithTail implements FlyBehavior {

	@Override
	public void performFly() {
		System.out.println("Tail lift up, pat down, up, down ...");
	}

}
