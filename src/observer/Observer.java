package observer;

import java.util.List;
import java.util.Map;
/**
 * An obsever can subscribe/unsubscribe any subjects
 * whenever a subject's status changes, inform the observers with arguments map;
 * @author zhaozy
 */
public abstract class Observer {
	
	List<Subject> subjects=null;//every observer holds a list recording subscribed subjects
	
	/**
	 * subscribe a subject
	 * @param subject
	 */
	public abstract void subscribe(Subject subject);
	
	/**
	 * unsubscribe a subject
	 * @param subject
	 */
	public abstract void unSubscribe(Subject subject);
	
	/**
	 * update with arguments map when subject sends the change message
	 * @param subject
	 * @param argsMap
	 */
	public abstract void update(Subject subject,Map<String, Object> argsMap);
}
