package observer;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		WeatherSubject subject=new WeatherSubject();
		Observer reader1=new WeatherListener();
		Observer reader2=new WeatherListener();
		
		reader1.subscribe(subject);
		reader2.subscribe(subject);
		
		Thread.sleep(1000);
		
		subject.setHeatIndex(23.33333f);
		Thread.sleep(2000);
		subject.setTemperature(-1.1111111f);
		Thread.sleep(3000);
		subject.setWeather("Thunderstorm");
		
		reader1.unSubscribe(subject);
		reader2.unSubscribe(subject);
	}

}
