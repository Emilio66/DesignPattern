package factory.Abstract;

/**
 * abstract factory pattern defines a group of product create methods which is very similar to factory method pattern
 * weakness is: every time product changes, interface must change, extends interface to comply with open-close principle
 * 
 * @author zhaozy
 */
public interface IngredientFactory {
	Dough createDough();
	Clam createClam();
	Sauce createSauce();
	Cheese createCheese();
}
