package beginner;

public class DuckTest {

	public static void main(String[] args) {
		RedheadDuck redheadDuck = new RedheadDuck();
		DecoyDuck decoyDuck =new DecoyDuck();
		RubberDuck rubberDuck = new RubberDuck();
		
		//polymorphic features
		Duck[] ducks={decoyDuck,rubberDuck,redheadDuck};
		for (Duck duck : ducks) {
			duck.fly();
			duck.quake();
			duck.swim();
		}
	}

}
