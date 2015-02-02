package decorate.improve;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Beverage {
	private String description;
	private double cost;
	private Map<Condiment, Integer> flavors = new HashMap<Condiment, Integer>();

	public Beverage(){}
	
	public Beverage(String desc, double c) {
		this.description = desc;
		this.cost = c;
	}

	/**
	 * ressemble the description of beverage
	 * 
	 * @return
	 */
	public String getDesc() {
		String desc=this.description;
		if (!flavors.isEmpty())
			for (Entry<Condiment, Integer> condiment : flavors.entrySet()) {
				desc += ", " + condiment.getValue() + " "+ condiment.getKey().desc();
			}

		return desc;
	}

	/**
	 * calculate the sum of this mixed beverage
	 * 
	 * @return
	 */
	public double sum() {
		double sum=this.cost;
		if (!flavors.isEmpty())
			for (Entry<Condiment, Integer> condiment : flavors.entrySet()) {
				sum += condiment.getKey().cost() * condiment.getValue(); // maybe not one copy of condiment
			}

		return sum;
	}

	public void add(Condiment con) {
		add(con, 1);
	}

	/**
	 * add "num" copys of condiment to beverage
	 * 
	 * @param condiment
	 * @param num
	 */
	public void add(Condiment condiment, int num) {

		if (flavors.containsKey(condiment)) {
			int currentNum = flavors.get(condiment);
			flavors.put(condiment, currentNum + num);
		} else {
			flavors.put(condiment, num);
		}
	}

	public void remove(Condiment con) {
		remove(con, 1);
	}

	public void remove(Condiment con, int num) {

		if (flavors.containsKey(con)) {
			if (flavors.get(con) <= num) {
				flavors.remove(con); // numbers of a specific condiment is 0
			} else {
				flavors.put(con,flavors.get(con)-num);
			}
		}
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	protected void setFlavors(Map<Condiment, Integer> flavors) {
		this.flavors = flavors;
	}	
	
}
