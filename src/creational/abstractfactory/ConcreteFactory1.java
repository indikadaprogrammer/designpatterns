package creational.abstractfactory;

public class ConcreteFactory1 implements AbstractFactory{

	public ConcreteFactory1() {
	}

	@Override
	public AbstractProductA createProductA() {
		AbstractProductA prod = new ProductA1();
		System.out.println("Creating " + prod);
		return prod;
	}

	@Override
	public AbstractProductB createProductB() {
		AbstractProductB prod = new ProductB1();
		System.out.println("Creating " + prod);
		return prod;
	}
	
}
