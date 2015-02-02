package observer;

import java.util.List;

public abstract class Subject {
	List<Observer> observers=null;	//new a list to record observers 
	/**
	 * when status of subject changes, inform the observers
	 */
	public abstract void onChange();
	
	/**
	 * register subject in the observer list
	 * @param o
	 */
	public abstract void register(Observer o);
	
	/**
	 * remove an observer from list
	 * @param o
	 */
	public abstract void unRegister(Observer o);
}
