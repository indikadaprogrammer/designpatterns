package creational.abstractfactory;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		AbstractProductA prod = new ProductA2();
		System.out.println("Creating " + prod);
		return prod;
	}

	@Override
	public AbstractProductB createProductB() {
		AbstractProductB prod = new ProductB2();
		System.out.println("Creating " + prod);
		return prod;
	}

}
