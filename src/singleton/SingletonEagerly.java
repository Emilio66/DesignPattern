package singleton;

public class SingletonEagerly {
	private static SingletonEagerly instance=new SingletonEagerly();;	//initialize when class loaded
	private SingletonEagerly(){
		System.out.println("New singleton eagerly: "+this.hashCode());
	}
	
	public static SingletonEagerly getInstance(){
		return instance;
	}
}
