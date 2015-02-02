package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk...");
	}

	//hook method to decide where the next branch goes
	public boolean wantCondiments() {
		String answer = getUserInput();
		if (answer.startsWith("n") || answer.startsWith("N") ) {
			return false;
		}
		return true;
	}

	private String getUserInput(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Would you like some sugar and milk with your coffee? (y/n)");
		String answer=null;
		try {
			answer=reader.readLine();
		} catch (IOException e) {
			System.out.println("Read error!");
			e.printStackTrace();
		}
		if (answer == null) {
			answer ="no";
		}
		return answer;
	}
	
}
