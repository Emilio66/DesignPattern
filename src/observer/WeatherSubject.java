package observer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WeatherSubject extends Subject {
	private float temperature;
	private float heatIndex;
	private String weather;

	public WeatherSubject(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void onChange() {		//when status changed, inform the observers in the list.
		Map<String, Object> argsMap=getArgs();
		for (Observer iterator : observers) {
			iterator.update(this, argsMap);
		}
	}

	private Map<String, Object> getArgs(){
		HashMap<String, Object> map= new HashMap<String, Object> (3);
		map.put("temperature", temperature);
		map.put("heatIndex", heatIndex);
		map.put("weather", weather);
		return map;
	}

	@Override
	public void register(Observer o) {
		if (observers.indexOf(o) == -1) {
			observers.add(o);
			System.out.println(this.hashCode()+" : Newbie "+o.hashCode()+" is listening to us :-)\n");
		}	
	}

	@Override
	public void unRegister(Observer o) {
		int index;
		if ((index=observers.indexOf(o)) != -1) {
			observers.remove(index);
			System.out.println(this.hashCode()+" : We lost another reader "+o.hashCode()+" @@\n");
		}
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
		this.onChange();
	}

	public void setHeatIndex(float heatIndex) {
		this.heatIndex = heatIndex;
		this.onChange();
	}

	public void setWeather(String weather) {
		this.weather = weather;
		this.onChange();
	}
}
