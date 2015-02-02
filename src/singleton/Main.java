package singleton;

import java.util.concurrent.Phaser;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// high concurrent access	
		final Phaser phaser = new Phaser(30);	//predefined parties is the usual case
		visitor[]  visitors = new visitor[30];//initialize is a must
		for (int i = 0; i < visitors.length; i++) {
			visitors[i]=new visitor();
		}
		
		for ( final visitor visitor : visitors) {
			//phaser.register();	//if you don't know the number of parties, you can register one by one use phaser(1)
			new Thread(){
				public void run() {
					 System.out.println(System.currentTimeMillis()+" create   -- "+this.getName());
			         phaser.arriveAndAwaitAdvance(); // await all creation, equals to cyclicbarrier.await() 
			         visitor.run();
			    }				
			}.start();
			int i2=phaser.getArrivedParties();
			int i3=phaser.getRegisteredParties();
			int i4=phaser.getUnarrivedParties();
			System.out.println(System.currentTimeMillis()+" arrived: "+i2+" unarrived: "+i4+" registered: "+i3);
		}
		Thread.sleep(200);	//wait to see the results
		int i2=phaser.getArrivedParties();
		int i3=phaser.getRegisteredParties();
		int i4=phaser.getUnarrivedParties();
		System.out.println(System.currentTimeMillis()+" ---last--- arrived: "+i2+" unarrived: "+i4+" registered: "+i3);
		// deregister party from current barrier manually
		//phaser.arriveAndDeregister();
	}

}

class visitor implements Runnable{
	
	@Override
	public void run() {
		SingletonDanger.getInstance();   //not safe
		//SingletonEagerly.getInstance();	//not good if seldom used
		//Singleton.getInstance();		//safe and efficient
	}
}