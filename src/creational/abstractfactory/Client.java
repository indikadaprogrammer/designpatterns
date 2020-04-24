package creational.abstractfactory;

public class Client {

	AbstractFactory factory = null;
	
	public Client(AbstractFactory factory) {
		this.factory = factory;
	}
	
	public void createProducts() {
		factory.createProductA();
		factory.createProductB();
	}
	
}
