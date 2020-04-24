package creational.abstractfactory;

public class Driver {

	public static void main(String[] args) {
		
		Client c1 = new Client( new ConcreteFactory1());
		c1.createProducts();
		
		System.out.println();
		
		Client c2 = new Client( new ConcreteFactory2());
		c2.createProducts();

	}

}
