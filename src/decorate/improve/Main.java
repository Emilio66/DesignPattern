package decorate.improve;

public class Main {

	public static void main(String[] args) {
		Beverage houseBlend = new HouseBlend(100);
		Beverage decaf =new Decaf(200);
		
		Condiment whip=	new Whip(100);
		Condiment soy =	new Soy(50);
		Condiment milk= new Milk(100);
		Condiment mocha=new Mocha(50);
		
		houseBlend.add(whip);
		houseBlend.add(soy,2);
		System.out.println("Beverage: "+houseBlend.getDesc()+"\t cost: $"+houseBlend.sum());
		System.out.println("\nRemove 1 soy: ");
		houseBlend.remove(soy);
		System.out.println("Beverage: "+houseBlend.getDesc()+"\t cost: $"+houseBlend.sum());
		
		decaf.add(milk,3);
		decaf.add(mocha,2);
		System.out.println("\nBeverage: "+decaf.getDesc()+"\t cost: $"+decaf.sum());
		
		System.out.println("\nRemove 4 milk, add 2 whip");
		decaf.remove(milk,4);
		decaf.add(whip,2);
		System.out.println("Beverage: "+decaf.getDesc()+"\t cost: $"+decaf.sum());
	}

}
