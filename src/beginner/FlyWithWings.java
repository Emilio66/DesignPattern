package beginner;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void performFly() {
		System.out.println("Wings up, down, up, down ....");
	}

}
