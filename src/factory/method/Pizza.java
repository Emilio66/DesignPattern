package factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * The procedure of produce a pizza
 * @author zhaozy
 *
 */
public abstract class Pizza {
	String name;
	String sauce;
	List<String> flavors = new ArrayList<String>();
	
	public void prepare(){
		System.err.println("Preparing: "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce "+sauce);
		System.out.println("Casting toppings ");
		for (String top : flavors) {
			System.out.println(top+"\t");
		}
	};
	public void bake(){
		System.out.println("Bake for 25 miniutes at 350 degree");
	}
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box(){
		System.out.println("Place pizza in official Pizza Store box\n");
	}
	
	public String getName(){
		return name;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setFlavors(List<String> flavors) {
		this.flavors = flavors;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
