package observer;

import java.util.ArrayList;
import java.util.Map;

public class WeatherListener extends Observer {
	
	public WeatherListener(){
		subjects =new ArrayList<Subject>();
	}
	
	@Override
	public void subscribe(Subject subject) {
		if (subject instanceof WeatherSubject && !subjects.contains(subject)) {
			subjects.add(subject);	//add this subject to list
			System.out.println(this.hashCode()+" : "+subject.hashCode()+" has been subscribed ~~");
			subject.register(this);	//make sure the subject know this event
		}else {
			System.out.println(subject+" is already be subscribed ~~\n");
		}		
	}

	@Override
	public void unSubscribe(Subject subject) {
		int index;
		if (subject instanceof WeatherSubject && (index=subjects.indexOf(subject))!=-1) {
			subjects.remove(index);		//remove the subject from the event
			System.out.println(this.hashCode()+" : "+subject.hashCode()+" has been kicked out !");
			subject.unRegister(this);	//make sure the subject know this event
		}
	}

	@Override
	public void update(Subject subject, Map<String, Object> argsMap) {
		System.out.println(this.hashCode()+" : "+" New message from "+subject.hashCode()+" ~~\n");
		display(argsMap);
	}

	public void display(Map<String, Object> argsMap){
		for (Map.Entry<String, Object> entry : argsMap.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}	
	}
}
