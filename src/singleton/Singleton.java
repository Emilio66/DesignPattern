package singleton;

/**
 * Lazy instantiate singleton, thread-safe and efficient
 * @author zhaozy
 */
public class Singleton {
	private volatile static Singleton instance;
	private Singleton(){
		//System.out.println("create singleton: "+instance.hashCode());
		System.out.println("create singleton: "+this.hashCode());
	}
	public static Singleton getInstance(){
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
