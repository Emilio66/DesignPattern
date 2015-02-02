package singleton;

public class SingletonDanger {
	private static SingletonDanger instance;
	private SingletonDanger(){
		System.out.println(System.currentTimeMillis()+" : "+"New singleton unsafely: "+this.hashCode()+" -- "+Thread.currentThread().getName());
	}
	
	public static SingletonDanger getInstance(){
		if (instance == null) {
			instance = new SingletonDanger();
		}
		return instance;
	}
}
