package adapter;

public class Main {
	public static void main(String[]args) {
		Turkey turkey=new TurkeyAdapter(new Duck());
		turkey.gobble();
		turkey.fly();
	}
}
