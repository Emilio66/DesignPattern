package facade;

/**
 * I want to refactor this facade pattern by using the abstract class for sub-system
 * Facade possess a list of devices which can be added or eliminated, utilizing these devices to 
 * create various procedures which is customizable for users.
 * @author zhaozy
 */
public abstract class Device {
	protected String name;
	public Device(String name){
		this.name=name;
	}
	
}
