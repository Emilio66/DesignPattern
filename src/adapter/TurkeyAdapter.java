package adapter;

import java.util.Random;

public class TurkeyAdapter implements Turkey{
	public Duck duck;
	
	public TurkeyAdapter(Duck duck){
		this.duck=duck;
	}
	
	@Override
	public void gobble() {
		duck.quake();
	}

	@Override
	public void fly() {
		Random random=new Random();//duck can fly 5 times distance than turkey
		if (random.nextInt(5)%5==0) {
			duck.fly();
		}
	}

}
